package project3.service;

/**
 * @author lt
 * @Description 关于开发团队成员的管理：添加、删除等
 * @data 8/10 - 10:55
 */

/**
 * TeamService
 * - counter:int = 1
 * - MAX_MEMBER:final int = 5
 * - team:Programmer[] = new Programmer[MAX_MEMBER];
 * - total:int = 0;
 * + getTeam():Programmer[]
 * + addMember(e:Employee)throws TeamException:void
 * + removeMember(memberId:int)throws TeamException:void
 */

import project3.domain.Architect;
import project3.domain.Designer;
import project3.domain.Employee;
import project3.domain.Programmer;

/**
 * · 功能：关于开发团队成员的管理：添加、删除等
 * · 说明：
 *   > counter为静态变量，用来为开发团队新增成员自动生成团队中的唯一ID，即memberId。(提示：应使用增1的方式)
 *   > MAX_MEMBER:表示开发团队最大成员数
 *   > team数组：用来保存当前团队中的各成员对象
 *   > total:记录团队成员的实际人数
 */

public class TeamService {
    private static int counter = 1;//给memberId赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际的人数

    public TeamService() {
    }

    //获取开发团队中的所有成员
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;//存在成员未满的情况
    }

    //将指定员工添加到开发团队中
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在开发团队中");
        }
        //该员工已是某团队成员
        //该员工正在休假，无法添加
        Programmer p = (Programmer) e;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {//if(p.getStatus().getNAME().equals("BUSY"))
            throw new TeamException("该成员已是某团队成员");
        } else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {//忽略大小写
            throw new TeamException("该员工正在休假，无法添加");
        }
        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员

        //获取team已有成员的架构师、设计师、程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }

        }

        //将p（或e）添加到现有的team中
        team[total] = p;
        total++;//team[total++] = p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);


    }

    //判断指定员工是否已存在开发团队中
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }

        return false;
    }

    //从团队中删除成员
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定memberId的情况
        if (i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        //后一个元素覆盖前一个元素，实现删除操作
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        //team[total - 1] = null;
        //total--;
        //或
        team[--total] = null;//先自减，再操作

    }
}

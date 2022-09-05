package project3.view;

/**
 * @author lt
 * @Description 数据的展示、与控制台之间的交互(显示、添加、删除)
 * @data 8/15 - 8:58
 */

/**
 * TeamView
 * - listSvc:NameListService = new NameListService()
 * - teamSvc:TeamService = new TeamService()
 * + enterMainMenu():void
 * - listAllEmployees():void
 * - getTeam():void
 * - addMember():void
 * - deleteMember():void
 * + main(args:String[]):void
 */

import project3.domain.Employee;
import project3.domain.Programmer;
import project3.service.NameListService;
import project3.service.TeamException;
import project3.service.TeamService;

/**
 * · 说明：
 *   > listSvc和teamSvc属性：供类中的方法使用
 *   > enterMainMenu()方法：主界面显示及控制方法。
 *   > 以下方法仅供enterMainMenu()方法调用：
 *     √ listAllEmployees()方法：以表格形式列出公司所有成员
 *     √ getTeam()方法：显示团队成员列表操作
 *     √ addMember()方法：实现添加成员操作
 *     √ deleteMember()方法：实现删除成员操作
 */

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu() {

        boolean loopFlag = true;//循环标签
        char menu = 0;
        while (loopFlag) {//*

            if (menu != '1') {
                listAllEmployees();
            }

            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    //显示所有的员工信息
    private void listAllEmployees() {
        System.out.println("-------------------------------开发团队调度软件-------------------------------\n");

        Employee[] employees = listSvc.getAllEmployees();
        if (employees == null || employees.length == 0) {
            System.out.println("公司没有任何员工信息！");
        } else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");

            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }

        System.out.print("-----------------------------------------------------------------------------\n");
    }

    //查看开发团队情况
    private void getTeam() {
        System.out.println("--------------------团队成员列表--------------------\n");

        Programmer[] team = teamSvc.getTeam();
        if (team.length == 0) {
            System.out.println("开发团队目前没有成员！");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }

        System.out.print("---------------------------------------------------\n");
    }

    //添加团队成员
    private void addMember() {
        System.out.println("----------------------添加成员----------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        //按回车键继续...
        TSUtility.readReturn();

    }

    //删除团队成员
        private void deleteMember () {
            System.out.println("----------------------删除成员----------------------");
            System.out.println("请输入要删除的员工的TID：");
            int memberId = TSUtility.readInt();

            System.out.println("确认是否删除(Y/N):");
            char isDelete = TSUtility.readConfirmSelection();
            if(isDelete == 'N'){
                return;
            }

            try {
                teamSvc.removeMember(memberId);
                System.out.println("删除成功");
            } catch (TeamException e) {
                System.out.println("删除失败，原因：" + e.getMessage());
            }
            //按回车键继续...
            TSUtility.readReturn();

        }

        public static void main (String[] args){
            TeamView view = new TeamView();
            view.enterMainMenu();
        }

    }


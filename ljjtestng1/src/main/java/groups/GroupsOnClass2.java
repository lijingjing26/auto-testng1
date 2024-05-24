package groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println(" GroupsOnClass22222中的stu1AAAA运行");
    }
    public void stu2(){
        System.out.println(" GroupsOnClass22222中的stu2BBBBB运行");
    }
}

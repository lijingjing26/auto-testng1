package groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println(" GroupsOnClass1中的stu1AAAA运行");
    }
    public void stu2(){
        System.out.println(" GroupsOnClass1中的stu2BBBBB运行");
    }
}

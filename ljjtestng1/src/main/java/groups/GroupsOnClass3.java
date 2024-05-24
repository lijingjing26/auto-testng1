package groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println(" GroupsOnClass3333中的teacher1AAAA运行");
    }
    public void teacher2(){
        System.out.println(" GroupsOnClass3333中的teacher2BBBBB运行");
    }
}

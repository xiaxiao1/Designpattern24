package com.xiaxiao.designpattern24;

import android.view.View;

import com.xiaxiao.designpattern24.abstractfactory.factory.FemaleHumanFactory;
import com.xiaxiao.designpattern24.adapter.AdapterUser;
import com.xiaxiao.designpattern24.adapter.Client4UserInterface;
import com.xiaxiao.designpattern24.adapter.UserImpl;
import com.xiaxiao.designpattern24.adapter.UserInterface;
import com.xiaxiao.designpattern24.bridge.Clothes;
import com.xiaxiao.designpattern24.bridge.House;
import com.xiaxiao.designpattern24.bridge.HouseCrop;
import com.xiaxiao.designpattern24.bridge.ShanZhaiCrop;
import com.xiaxiao.designpattern24.bridge.interfaces.Crop;
import com.xiaxiao.designpattern24.bridge.interfaces.Product;
import com.xiaxiao.designpattern24.builder.BengBengCarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarModel;
import com.xiaxiao.designpattern24.builder.Director;
import com.xiaxiao.designpattern24.builder.KartCarBuilder;
import com.xiaxiao.designpattern24.command.Invoker;
import com.xiaxiao.designpattern24.command.bean.ProjectManager;
import com.xiaxiao.designpattern24.command.bean.Staff;
import com.xiaxiao.designpattern24.command.bean.UI;
import com.xiaxiao.designpattern24.command.commands.AbstractCommand;
import com.xiaxiao.designpattern24.command.commands.AddUICommand;
import com.xiaxiao.designpattern24.command.commands.ManagerCommand;
import com.xiaxiao.designpattern24.command.commands.ProgrammerCommand;
import com.xiaxiao.designpattern24.composite.LiShiStaff;
import com.xiaxiao.designpattern24.composite.StaffNodeInterface;
import com.xiaxiao.designpattern24.decorator.ColorHairDecorator;
import com.xiaxiao.designpattern24.decorator.Girl;
import com.xiaxiao.designpattern24.decorator.LongHairDecorator;
import com.xiaxiao.designpattern24.decorator.interfaces.Person;
import com.xiaxiao.designpattern24.facade.FacadeLetter;
import com.xiaxiao.designpattern24.factorymethod.AbstractFactory;
import com.xiaxiao.designpattern24.factorymethod.Human;
import com.xiaxiao.designpattern24.factorymethod.HumanFactory;
import com.xiaxiao.designpattern24.factorymethod.WhiteHuman;
import com.xiaxiao.designpattern24.factorymethod.YelloHuman;
import com.xiaxiao.designpattern24.iterator.Project;
import com.xiaxiao.designpattern24.iterator.interfaces.IProject;
import com.xiaxiao.designpattern24.iterator.interfaces.IProjectIterator;
import com.xiaxiao.designpattern24.observer.BF;
import com.xiaxiao.designpattern24.observer.GF;
import com.xiaxiao.designpattern24.proxy.dynamic.LoginHandler;
import com.xiaxiao.designpattern24.proxy.dynamic.UserManager;
import com.xiaxiao.designpattern24.proxy.dynamic.UserManagerImpl;
import com.xiaxiao.designpattern24.proxy.force.ForceGamePlayer;
import com.xiaxiao.designpattern24.proxy.force.ForceGamePlayerProxy;
import com.xiaxiao.designpattern24.proxy.force.ForceIGamePlayer;
import com.xiaxiao.designpattern24.proxy.normal.GamePlayer;
import com.xiaxiao.designpattern24.proxy.normal.GamePlayerProxy;
import com.xiaxiao.designpattern24.proxy.normal.IGamePlayer;
import com.xiaxiao.designpattern24.singleton.ExtendSingleTon;
import com.xiaxiao.designpattern24.singleton.SingleTon1;
import com.xiaxiao.designpattern24.strategy.HumorStrategy;
import com.xiaxiao.designpattern24.strategy.LoveContext;
import com.xiaxiao.designpattern24.strategy.MoneyStrategy;
import com.xiaxiao.designpattern24.strategy.TimeStrategy;
import com.xiaxiao.designpattern24.strategy.interfaces.Boy;
import com.xiaxiao.designpattern24.templatemethod.AbstractCar;
import com.xiaxiao.designpattern24.templatemethod.Benz;
import com.xiaxiao.designpattern24.templatemethod.Hummer;
import com.xiaxiao.designpattern24.util.DPUtil;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
//        Decorator();
//        iteratorTest(6);
//        strategyTest();
//        proxyTest();
//        forceProxyTest();
//        DynamicProxyTest();
//        SingleTonTest();
//        ExtendSingleTonTest();
//        FactoryMethodTest();
//        AbstractFactoryTest();
//        FacadeTest();
//        AdapterTest();
//        TemplateMethodTest();
//        BuilderTest1();
//        BuilderTest2();
//        BridgeTest();
//        CommandTest();
//        CompositeTest();
        ObserverTest();
       /* com.xiaxiao.designpattern24.facade.Test test = new com.xiaxiao.designpattern24.facade.Test();
        test.Ha();*/
    }


    public void Decorator() {
        Person girl=new Girl("Lucy");
        girl.showHair();
        DPUtil.splitLine();

        girl = new ColorHairDecorator(girl, "红色");
        girl.showHair();
        DPUtil.splitLine();

        girl = new LongHairDecorator(girl);
        girl.showHair();

    }


    public void IteratorTest(int size) {
        IProject project = new Project();
        for (int i=0;i<size;i++) {
            project.add("name"+i,"num"+i,"costdfssd");
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            Project p = (Project)projectIterator.next();
            p.getInfo();
        }
    }

    public void StrategyTest() {
        Boy boy = new Boy();
        boy.wantAGirlFriend();

        DPUtil.print("---------------刚认识女孩子时----------------");
        LoveContext love1 = new LoveContext(new TimeStrategy());
        love1.goAfterGirl();

        DPUtil.print("------------------成为朋友了，进一步赢得芳心--------------------");
        LoveContext love2 = new LoveContext(new MoneyStrategy());
        love2.goAfterGirl();

        DPUtil.print("--------------------最后，展示个人魅力，稳固关系-------------------");
        LoveContext love3 = new LoveContext(new HumorStrategy());
        love3.goAfterGirl();
        //以上是做了一个封装，真正的使用时，代码都在findAGirlFriend方法中，

    }

    public void ProxyTest() {
        IGamePlayer player = new GamePlayer("xia xiao");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player);
        gamePlayerProxy.login("hahaha","111111");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.update();
        DPUtil.print("以上就是最简单的代理模式，代理人和被代理人来自同一个接口， 代理人对外调用  ，真正 干活的还是被代理人");
    }

    public void ForceProxyTest() {
        ForceIGamePlayer gamePlayer = new ForceGamePlayer("zhang qian");
        gamePlayer.login("gaga","232323");
        gamePlayer.killBoss();
        ForceIGamePlayer proxy = new ForceGamePlayerProxy(gamePlayer);
        proxy.killBoss();

        ForceIGamePlayer slefProxy = gamePlayer.getProxy();
        slefProxy.login("daii","1111");
        slefProxy.killBoss();
        slefProxy.update();
//        InvocationHandler
    }

    public void DynamicProxyTest() {
        LoginHandler loginHandler = new LoginHandler();
        UserManager userManager = (UserManager) loginHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("id--123", "name--夏笑");
    }

    public void SingleTonTest() {
        SingleTon1 singleTon1 = SingleTon1.getInstance();
        singleTon1.say("hello");
    }
    public void ExtendSingleTonTest() {
        ExtendSingleTon singleTon1 = ExtendSingleTon.getInstance();
        singleTon1.say();
    }

    public void FactoryMethodTest() {
        AbstractFactory humanFactory = new HumanFactory();
        Human white = humanFactory.createHuman(WhiteHuman.class);
        Human yellow= humanFactory.createHuman(YelloHuman.class);
        white.laugh();
        yellow.laugh();
    }


    public void AbstractFactoryTest() {
        com.xiaxiao.designpattern24.abstractfactory.factory.AbstractFactory femaleFactory = new
                FemaleHumanFactory();
        com.xiaxiao.designpattern24.abstractfactory.human.Human femaleYellowHuman = femaleFactory
                .createYellowHuman();
        femaleYellowHuman.laugh();
        femaleYellowHuman.cry();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();
    }

    public void FacadeTest() {
        FacadeLetter facadeLetter = new FacadeLetter();
        facadeLetter.sendLetter("给老婆写一封情书", "地址是她的心");
    }

    public void AdapterTest() {

        //以下是配套的，正常使用
        UserInterface userInterface = new UserImpl();
        Client4UserInterface client4UserInterface = new Client4UserInterface();
        client4UserInterface.getInfo(userInterface);

        DPUtil.print("===================================================================\n\n");
        //当操作OtherUserType类型的user  Client4UserInterface不能直接使用 ，，拿出适配器
        UserInterface adapterUser = new AdapterUser();
        client4UserInterface.getInfo(adapterUser);
    }

    public void TemplateMethodTest() {
        AbstractCar hummer = new Hummer();
        hummer.run();

        AbstractCar benz = new Benz();
        benz.run();
    }

    public void BuilderTest1() {
        CarBuilder bengbengCarBuilder = new BengBengCarBuilder();
        bengbengCarBuilder
                .prepareACarmodel()
                .alarm()
                .stop()
                .start()
                .setOrder()
                .getCarModel()
                .run();
        CarBuilder kartCarBuilder = new KartCarBuilder();
        kartCarBuilder
                .prepareACarmodel()
                .stop()
                .alarm()
                .start()
                .setOrder()
                .getCarModel()
                .run();
    }

    public void BuilderTest2() {
        Director carDirector = new Director();
        CarModel bengbeng1 = carDirector.getATypeBengbeng();
        CarModel bengbeng2 = carDirector.getBTypeBengbeng();
        CarModel kart1 = carDirector.getCTypeKart();
        CarModel kart2 = carDirector.getDTypeKart();

        bengbeng1.run();
        DPUtil.print("--------------------------------------------\n");
        bengbeng2.run();
        DPUtil.print("--------------------------------------------\n");

        kart1.run();
        DPUtil.print("--------------------------------------------\n");
        kart2.run();

        //如果按照设计模式之禅上的写法，上面生成的四个carmodel,
        //bengbeng1==bengbeng2,,,,,kart1==kart2,,
        //按照上下文理解，这应该是不对的吧
    }

    public void BridgeTest() {
        House house = new House();
        Crop houseCrop = new HouseCrop(house);//所以这就是一个生产房子的公司了
        Clothes clothes = new Clothes();
        Crop shanzhaiCrop = new ShanZhaiCrop(clothes);
        houseCrop.makeMoney();
        DPUtil.splitLine();
        shanzhaiCrop.makeMoney();

        //现在山寨公司不想做衣服了，想做汽车：
        class ShanZhaiCar extends Product {
            @Override
            public void beProduced() {
                DPUtil.print("做好了一辆山寨奔驰，叫笨池");
            }

            @Override
            public void beSelled() {
                DPUtil.print("笨池车卖了");
            }
        }
        ShanZhaiCar car = new ShanZhaiCar();
        shanzhaiCrop = new ShanZhaiCrop(car);
        DPUtil.splitLine();
        shanzhaiCrop.makeMoney();

    }

    public void CommandTest() {

        /*
        * 下面这种方式，对于高层来说只要发出命令就行，不需要关系到底是谁在执行的。
        * 但是这里却需要暴露顶层的Staff对象。
        * 原来是这样的：new AddUICommand(new UI())
        *
        * 按法则来说，这里是不能暴露Staff的，所以要这样实现的话，需要在AbastarctCommand中事先内置好所有的员工类对象，以供不同的Command实现类调用
        *
        * 也可以有别的实现方式，不需要实现内置好所有的Staff ,
        * 在每个子类的构造方法中内置一下就好了{@link com.xiaxiao.designpattern24.command.commands.AddUICommand}
        * */
        Invoker xiaxiao = new Invoker();
        AbstractCommand uiCommand = new AddUICommand();
        xiaxiao.setCommand(uiCommand);
        xiaxiao.execute();
        DPUtil.splitLine();
        AbstractCommand programmerCommand = new ProgrammerCommand();
        xiaxiao.setCommand(programmerCommand);
        xiaxiao.execute();
        DPUtil.splitLine();
        AbstractCommand managerCommand = new ManagerCommand();
        xiaxiao.setCommand(managerCommand);
        xiaxiao.execute();

        /*
        * gaocengl高层领导有一天发现员工在玩游戏，
        * 于是给项目经理下达一项新的监督员工的命令
        * */
        /*
        * 这是我自己想的，但是感觉这个模式这么用不太对，监督员工是项目经理的一个新的功能了，应该是另一个岗位了。需要修改的是Staff类吧，
        * 这里感觉不对，要想在模式中实现的话，应该再实现一个Staff子类，如watchCommand2才应该是对的。
        * */
        DPUtil.splitLine();
        AbstractCommand watchCommand=new AbstractCommand(new ProjectManager()) {
            @Override
            protected void execute(Staff receiver) {
                DPUtil.print("项目经理在监督着大家好好工作");
                receiver.work();
            }
        };
        xiaxiao.setCommand(watchCommand);
        xiaxiao.execute();
        DPUtil.splitLine();

        AbstractCommand watchCommand2=new AbstractCommand(new Staff() {
            @Override
            public void work() {
                DPUtil.print("我是督查员，我在监管员工，看看谁在玩游戏，弄他。");
            }
        }) {
            @Override
            protected void execute(Staff receiver) {
                DPUtil.print("为了监督员工好好工作，增设一个新的岗位，督查员");
                DPUtil.print("督察员开始工作了:");
                receiver.work();
            }
        };
        xiaxiao.setCommand(watchCommand2);
        xiaxiao.execute();
    }

    public void CompositeTest() {
        LiShiStaff boss = new LiShiStaff("1黑龙", "大boss", "10000");

        LiShiStaff manager1= new LiShiStaff("2张三", "技术部老大", "340000");
        LiShiStaff manager2= new LiShiStaff("3亚洲舞王赵四", "活动部老大", "10000");
        LiShiStaff manager3= new LiShiStaff("4王二小", "运营部大哥", "10000");

        LiShiStaff ui= new LiShiStaff("2lucy", "ui射鸡师", "10000");
        LiShiStaff coder1= new LiShiStaff("2金子", "测试员", "10000");
        LiShiStaff coder2= new LiShiStaff("2程序猿1号", "代码民工", "10000");

        LiShiStaff lingdui= new LiShiStaff("3铁锤", "领队", "10000");
        LiShiStaff cat= new LiShiStaff("3猫仔", "打杂的", "10000");

        LiShiStaff dog= new LiShiStaff("4狗蛋", "运营小兵", "10000");

        LiShiStaff xiaomi= new LiShiStaff("1小咪咪", "老大的秘书", "10000");

        boss.addChild(xiaomi);
        boss.addChild(manager1);
        boss.addChild(manager2);
        boss.addChild(manager3);

        manager1.addChild(ui);
        manager1.addChild(coder1);
        manager1.addChild(coder2);

        manager2.addChild(lingdui);
        manager2.addChild(cat);

        manager3.addChild(dog);

        DPUtil.print(boss.getInfo());
        DPUtil.splitLine();

        ArrayList<StaffNodeInterface> children = boss.getChildren();
        printCropInfos(children);
        DPUtil.splitLine();
        String patentInfo=xiaomi.getParent().getInfo();
        DPUtil.print(patentInfo);
        DPUtil.print("老板还要一个小蜜,来咯");
        xiaomi.getParent().addChild(new LiShiStaff("大眼萌","二秘书","20009"));
        printCropInfos(boss.getChildren());
    }


    public void printCropInfos(ArrayList<StaffNodeInterface> list) {
        for (StaffNodeInterface child : list) {
            DPUtil.print(child.getInfo());
            if (child.hasChild()) {
                printCropInfos(child.getChildren());
                DPUtil.splitLine();
            }
        }
    }

    public void ObserverTest() {
        BF dabao = new BF();
        GF qianqian = new GF("倩倩");
        GF xiaoli = new GF("小丽");
        GF lingling = new GF("玲玲");
        dabao.addObserver(qianqian);
        dabao.addObserver(xiaoli);
        dabao.addObserver(lingling);


        dabao.chat();
        dabao.funWithgirl();
        dabao.sleep();
    }






































































































}
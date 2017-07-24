package com.xiaxiao.designpattern24;

import android.view.View;

import com.xiaxiao.designpattern24.abstractfactory.factory.FemaleHumanFactory;
import com.xiaxiao.designpattern24.adapter.AdapterUser;
import com.xiaxiao.designpattern24.adapter.Client4UserInterface;
import com.xiaxiao.designpattern24.adapter.UserImpl;
import com.xiaxiao.designpattern24.adapter.UserInterface;
import com.xiaxiao.designpattern24.builder.BengBengCarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarBuilder;
import com.xiaxiao.designpattern24.builder.interfaces.CarModel;
import com.xiaxiao.designpattern24.builder.Director;
import com.xiaxiao.designpattern24.builder.KartCarBuilder;
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
//        decorator(null);
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
        BuilderTest2();
       /* com.xiaxiao.designpattern24.facade.Test test = new com.xiaxiao.designpattern24.facade.Test();
        test.Ha();*/
    }


    public void Decorator(View view) {
        Person girl=new Girl("Lucy");
//        girl.showHair();
        girl = new ColorHairDecorator(girl, "红色");
        girl = new LongHairDecorator(girl);
        girl.showHair();
//        HashMap
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







































































































}
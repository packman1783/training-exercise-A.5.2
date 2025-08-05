package org.example;

import org.example.adapter.AsianPlug;
import org.example.adapter.EuroPlug;
import org.example.adapter.PlugToUSAdapter;
import org.example.adapter.USSocket;
import org.example.builder.Employee;
import org.example.chainOfResponsibility.*;
import org.example.decorator.*;
import org.example.proxy.Door;
import org.example.proxy.LabDoor;
import org.example.proxy.SecurityProxy;
import org.example.proxy.VaultDoor;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {
// ---------------------------------------------Strategy----------------------------------------------------------------
//        Auto sedan = new Auto("Camry", new StandardFillStrategy());
//        Auto tesla = new Auto("Tesla", new ElectricFillStrategy());
//        Auto prius = new Auto("Prius", new HybridFillStrategy());
//        Auto mirai = new Auto("Mirai", new HydrogenFillStrategy());
//
//        sedan.fill();
//        tesla.fill();
//        prius.fill();
//        mirai.fill();
//
//        prius.setFillStrategy(new ElectricFillStrategy());
//        prius.fill();

//----------------------------------------------Chain of responsibility-------------------------------------------------
//        SupportHandler operator = new OperatorHandler();
//        SupportHandler manager = operator.setNextHandler(new ManagerHandler());
//        manager.setNextHandler(new EngineerHandler());
//
//        operator.handleRequest(new SupportRequest(RequestType.SIMPLE, "How to change password?"));
//        operator.handleRequest(new SupportRequest(RequestType.DIFFICULT, "Why doesn't the bill match?"));
//        operator.handleRequest(new SupportRequest(RequestType.TECHNICAL, "The server is down, what should I do?"));
//        operator.handleRequest(new SupportRequest(null, "Something strange happened..."));

//----------------------------------------------Builder-----------------------------------------------------------------
//        Employee employee = new Employee.EmployeeBuilder("Alice", "OpenAI")
//                .withCar()
//                .withBike()
//                .build();
//
//        System.out.println(employee);

//----------------------------------------------Proxy-------------------------------------------------------------------
//        Door labDoor = new SecurityProxy(new LabDoor(), "qwerty");
//        Door vaultDoor = new SecurityProxy(new VaultDoor(), "12345");
//
//        labDoor.open("wrong");
//        labDoor.open("qwerty");
//        labDoor.close();
//
//        vaultDoor.open("12345");
//        vaultDoor.close();

//----------------------------------------------Decorator---------------------------------------------------------------
//        Shape simpleCircle = new Circle();
//        Shape redCircle = new RedBorderDecorator(new Circle());
//        Shape fancyTriangle = new ShadowDecorator(new RedBorderDecorator(new Triangle()));
//        Shape scaledShadowedCircle = new ScaleDecorator(new ShadowDecorator(new Circle()), 1.5);
//
//        simpleCircle.draw();
//
//        redCircle.draw();
//
//        fancyTriangle.draw();
//
//        scaledShadowedCircle.draw();

//----------------------------------------------Adapter-----------------------------------------------------------------
        USSocket asianAdapter = new PlugToUSAdapter(new AsianPlug(), "Asian");
        USSocket euroAdapter = new PlugToUSAdapter(new EuroPlug(), "Euro");

        asianAdapter.powerUp();
        euroAdapter.powerUp();

    }
}
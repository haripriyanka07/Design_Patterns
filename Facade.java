package com.designprinciples;
import java.sql.Driver;

class Firefox {
//    public static Driver getFirefoxDriver() {
//        return null;
//    }

    public static void generateHTMLReport(String test) {
        System.out.println("Generating HTML Report for Firefox Driver");
    }

    public static void generateJUnitReport(String test) {
        System.out.println("Generating JUNIT Report for Firefox Driver");
    }
}

class Chrome {
//    public static Driver getChromeDriver() {
//        return null;
//    }

    public static void generateHTMLReport(String test) {
        System.out.println("Generating HTML Report for Chrome Driver");
    }

    public static void generateJUnitReport(String test) {
        System.out.println("Generating JUNIT Report for Chrome Driver");
    }
}

class WebExplorerHelperFacade {
    public static void generateReports(String explorer, String report, String test) {
//        Driver driver = null;
        switch(explorer) {
            case "firefox":
//                dr/iver = Firefox.getFirefoxDriver();
                switch(report) {
                    case "html":
                        Firefox.generateHTMLReport(test);
                        break;
                    case "junit":
                        Firefox.generateJUnitReport(test);
                        break;
                }
                break;
            case "chrome":
//                driver = Chrome.getChromeDriver();
                switch(report) {
                    case "html":
                        Chrome.generateHTMLReport(test);
                        break;
                    case "junit":
                        Chrome.generateJUnitReport(test);
                        break;
                }
        }
    }
}


public class Facade {

    public static void main(String[] args) {
        String test = "CheckElementPresent";

        WebExplorerHelperFacade.generateReports("firefox", "html", test);
        WebExplorerHelperFacade.generateReports("firefox", "junit", test);
        WebExplorerHelperFacade.generateReports("chrome", "html", test);
        WebExplorerHelperFacade.generateReports("chrome", "junit", test);
    }

}

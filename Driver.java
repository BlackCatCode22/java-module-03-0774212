// GTC 9/12/24

public class Driver {
    public static void main(String[] args) {

        Tornado tornado = new Tornado();
        tornado.date = "May 3, 1999";
        tornado.location = "Moore, Oklahoma";
        tornado.duration = "1 hour and 25 minutes";
        tornado.maxWindSpeed = "321 MPH";
        tornado.rating = "F5";
        tornado.casualties = "36 dead, 583 injured";

        System.out.println(tornado.date);
        System.out.println(tornado.location);
        System.out.println(tornado.duration);
        System.out.println(tornado.maxWindSpeed);
        System.out.println(tornado.rating);
        System.out.println(tornado.casualties);






        Tornado tornado2 = new Tornado();
        tornado2.date = "May 31, 2013";
        tornado2.location = "El Reno, Oklahoma";
        tornado2.duration = "40 minutes";
        tornado2.maxWindSpeed = "155 mph (officially), 313 mph (unofficially)";
        tornado2.rating = "EF3";
        tornado2.casualties = "8 dead, 151 injured";

        System.out.println(tornado2.date);
        System.out.println(tornado2.location);
        System.out.println(tornado2.duration);
        System.out.println(tornado2.maxWindSpeed);
        System.out.println(tornado2.rating);
        System.out.println(tornado2.casualties);






    }
    }

package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City parque = new City();
      Thing espacio = new Thing(parque, 1, 2);
      Robot karel = new Robot(parque, 1, 0, Direction.EAST,5);
     
      // estacionamiento
      for (int iw = 0; iw++ < 9; iw ++){
      Wall pe =
               new Wall (parque, iw, 2, Direction.WEST ) ;
      Wall pe1 =
               new Wall (parque, iw, 2, Direction.NORTH) ;
      Wall pe2 =
               new Wall (parque, iw, 2, Direction.SOUTH ) ;
      }
      
      // parqueadero1
       for (int i = 0; i < 10; i++){               
    Wall p1 =
               new Wall (parque, i, 1, Direction.WEST ) ;
    Wall p3 =
               new Wall (parque, i, 3, Direction.EAST ) ;
       }
      
       for (int j = 1; j < 4; j++){               
    Wall p2 =
               new Wall (parque, 0, j, Direction.NORTH ) ;
       }
       
       // parqueadero2
         for (int ie = 0; ie < 10; ie++){               
    Wall p4 =
               new Wall (parque, ie, 5, Direction.WEST ) ;
    Wall p6 =
               new Wall (parque, ie, 7, Direction.EAST ) ;
       }
      
       for (int je = 5; je < 8; je++){               
    Wall p5 =
               new Wall (parque, 0, je, Direction.NORTH ) ;
       }
              
       for (int iw = 0; iw++ < 9; iw ++){
      Wall pe =
               new Wall (parque, iw, 6, Direction.WEST ) ;
      Wall pe1 =
               new Wall (parque, iw, 6, Direction.NORTH) ;
      Wall pe2 =
               new Wall (parque, iw, 6, Direction.SOUTH ) ;
      }
       
       
        // parqueadero3
        for (int iq = 0; iq < 10; iq++){               
    Wall p1 =
               new Wall (parque, iq, 9, Direction.WEST ) ;
    Wall p3 =
               new Wall (parque, iq, 11, Direction.EAST ) ;
       }
      
       for (int jq = 9; jq < 12; jq++){               
    Wall p2 =
               new Wall (parque, 0, jq, Direction.NORTH ) ;
       }
             
       
       for (int iw = 0; iw++ < 9; iw ++){
      Wall pe6 =
               new Wall (parque, iw, 10, Direction.EAST ) ;
      Wall pe7 =
               new Wall (parque, iw, 10, Direction.NORTH) ;
      Wall pe8 =
               new Wall (parque, iw, 10, Direction.SOUTH ) ;
      }       
       
       // zona temporal
       
       for (int ig = 13; ig < 22; ig++){               
    Wall pw =
               new Wall (parque, 5, ig, Direction.NORTH ) ;   
       }
      
       for (int jy = 5; jy < 8; jy++){               
    Wall peh =
               new Wall (parque, jy, 13, Direction.WEST ) ;
    Wall peh2 =
               new Wall (parque, jy, 21, Direction.EAST ) ;
       }        
       
       for (int iw = 13; iw++ < 20; iw ++){
      Wall pee =
               new Wall (parque, 6, iw, Direction.EAST ) ;
      Wall pee1 =
               new Wall (parque, 6, iw, Direction.NORTH) ;
      Wall pee2 =
               new Wall (parque, 6, iw, Direction.WEST ) ;
      }
//       
    
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      karel.pickThing();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
   }
}

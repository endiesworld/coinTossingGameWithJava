/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointossing;

import java.util.Random;

/**
 *
 * @author user
 */
public class RandomnumberGenerator {
  
    int minimum ;
    int maximum ;
    int numberGenerated ;
  Random rand = new Random();
  public RandomnumberGenerator(int minimum , int maximum){
     this.maximum = maximum ;
     this.minimum = minimum ;
    // generateRandomNumber() ;
    }
  
     
  public void generateRandomNumber(){
  int max = (maximum - minimum ) + 1 ;
  numberGenerated = rand.nextInt(max) + minimum ;
  
      
  } 
 public int getRandomNumber(){
 return numberGenerated ;
 }
    
 public static int generateRandomint(int min , int max){
  Random rand = new Random();
  int maxim = (max - min ) + 1 ;
  int numberGenerated = rand.nextInt(max) + min ;
  return numberGenerated ;
 }
 
 public static int[] randomWithNoRepete(int min , int max){
          int size = max - min ;
          Random rand = new Random();
          int[] numberHolder = new int [size];
          int  numberGenerated ;
          boolean saveNumber = true ;
          
          do {
            numberGenerated  =  rand.nextInt(max) + min ; //Math.floor( Math.random() * 20) ;
            for (int x = 0; x < 19 ; x++){
               if(numberHolder[x] == numberGenerated){
                 saveNumber = false ;
                 break ;
                 }
               }
               if(saveNumber){
               numberHolder[size] = numberGenerated ;
               size-- ; // = size -1 ;
                } 
               saveNumber = true ;
             } while(size > 0) ;

          return numberHolder ;
    }
 
}

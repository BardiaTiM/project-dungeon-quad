package org.bcit.comp2522.project;

/**
 * Skeleton class.
 */
public class Skeleton extends Waves{

  int arrow_speed;
  int fire_rate;
  double arrow_damage;

  int x_pos;
  int y_pos;

  public int Move(int x, int y){
    x_pos = x;
    y_pos = y;
    return 0;
  }

  public void shootArrow(int arrow_speed, int fire_rate, double arrow_damage){
    //throw arrow
  }
}
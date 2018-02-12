package org.ligerbots.powerup;

public class FieldPosition {
	
  /**
   * The y coordinate of the location in inches along the short axis of the field. 
   * +y is closer to the judges than. 
   * The origin this year is that the wall our robot is touching when it start is ** x = 0 **
   * because the field is symmetric -- it looks the same to the whichever whichever wall we're starting from
   * this is true in both the x and y dimensions
   */

  final double x;
  final double y;

  public FieldPosition(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public FieldPosition add(FieldPosition other) {
    return new FieldPosition(x + other.x, y + other.y);
  }

  public FieldPosition add(double x, double y) {
    return new FieldPosition(this.x + x, this.y + y);
  }

  public FieldPosition multiply(double xFactor, double yFactor) {
    return new FieldPosition(x * xFactor, y * yFactor);
  }

  public double angleTo(FieldPosition other) {
    return Math.toDegrees(Math.atan2(other.y - y, other.x - x));
  }

  public double distanceTo(FieldPosition other) {
    double dx = other.x - x;
    double dy = other.y - y;
    return Math.sqrt(dx * dx + dy * dy);
  }
}

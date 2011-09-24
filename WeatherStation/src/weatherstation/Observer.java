/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherstation;

/**
 *
 * @author michael
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

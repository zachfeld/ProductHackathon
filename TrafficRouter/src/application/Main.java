package application;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		/*
		 * as soon as we get a emergency vehicle request in a place, the first thing
		 * probably would be to look for all the response vehicle for that type nearby
		 * Then the second thing would be to see the shortest route for this vehicle If
		 * there is possiblilty of reducing the route time for a response vehicle, that
		 * is where our algorithm will work and calculate the shortest route after
		 * looking into the possibility of optimization then it will dispatch the
		 * vehicle with the shortest route and manipulate the traffic lights in between
		 * for optimization
 
		 * use real time GPS data/ tracking sensors to see traffic at an intersection
		 */

		// First lets work for a single intersection from the start point

		// start time of a vehicle from a point
		Date newDate = new Date();
		long startTime = newDate.getTime();
		
		// here we need to have array of routes
		// for every route we will then have array of intersections combination
		// we will initialize the traveller method and at the end receive the time in milliseconds.
		// need to specify somewhere the final destination is a stop and traffSpeed doesnot need to be max

	}

	public long [] traveller(long startTime) {
		long [] arr = new long[2];
		// assume this is the distance. Let us try to add coordinates to the
		// intersection, so we can use a
		// method that gives distance from our starting coordinates to the intersection
		// coordinates
		// for the straight road
		double distToI = 555; // I for intersection
		// we will use Sensors/ trackers or travel data to figure out traffic in the
		// intersection
		// this length will be only for the direction our EV in approaching
		int traffLen = 20;
		// estimated traffic speed at the intersection at the time when our EV will
		// approach it.
		// if there is no traffic, and the light is green, this will be optimal speed
		// if there is traffic and not moving, this will be 0
		// need to write a method that calculates and returns this
		double traffSpeed = 10.2;
		int topSpeed = 35; // speed limit at the intersection
		if (traffSpeed < topSpeed) {
			// this is where we look for the intervention and see how much time can be saved
			// and hence how much traffSpeed can be maximized.
			// we will change the value of traffSpeed after the intervention to the new
			// value
		}
		
		// this is the estimated optimal speed of our EV in the high range when it is
		// moving
		// this will be influenced by weather, road condition, road size, any
		// obstruction, and the vehicle type
		// need to write a method to estimate and return it too.
		double evSpeed = 80;
		int accTime = 5; // time taken by the vehicle to accelarate. Will be different depending on type,
							// initial speed and so. Need to write a method for this too
							// if vehicle approaching at an intersection, then use this passing speed to
							// calc accTime for next instance
							// if

		// for the first instance, the vehicle will take following time to reach from
		// start point to
		// the first intersection
		// the accTime will also cover some distance but it is not accounted for, we can
		// do that too
		double timeInSec = accTime + (distToI - traffLen) / evSpeed + traffLen / traffSpeed;

		long endTime = (long) (startTime + timeInSec * 1000);
		
		arr[0] = (long) traffSpeed;
		arr[1] = endTime;
		return arr;

	}

}

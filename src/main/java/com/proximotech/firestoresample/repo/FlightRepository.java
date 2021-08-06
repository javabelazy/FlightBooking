/**
 * 
 */
package com.proximotech.firestoresample.repo;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.proximotech.firestoresample.model.Flight;

/**
 * @author Apple
 *
 */
public class FlightRepository {

	@Autowired
	Firestore firestore;
	
	void writeDocumentFromObject(Flight flightchart) throws ExecutionException, InterruptedException {

		WriteResult writeResult = this.firestore.document("flight/fight-chart-0001").set(flightchart).get();

	}
	
}

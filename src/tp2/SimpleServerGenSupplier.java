package tp2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class SimpleServerGenSupplier extends ParameterSupplier{

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature arg0) throws Throwable {
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		Deserialization d= new Deserialization("src/tp2/serverKoratTests.obj");
		LinkedList<Server> servers=d.deserialization();
		int i=1;
		for(Server s: servers){
			values.add(PotentialAssignment.forValue("server "+Integer.toString(i), s));
			i++;
		}
		return values;
	}

}

import static Enums.Moves.*;
import Enums.Moves;
import java.util.ArrayList;

public class Algorithms {
	
	// returns Prime move (R --> R')
	// Not used
	public static Moves[] pr(Moves m) {
		Moves[] m3 = {m, m, m};
		return m3;
	}
	
	// Not used
	public static Moves[] convert(Moves[] m) {
		// TODO Iterate over m and replace R' with 3 * R
		return null;
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// COLL Algorithms
	// TODO Add all COLL Algs for Roux
	final static Moves[] Sune = {R, U, Rp, U, R, U, U, Rp};
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Permutations
	// TODO Add Y, and J-Perm
	
}

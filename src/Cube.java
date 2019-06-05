import Enums.Moves;
import static Enums.Moves.*;

public class Cube implements MoveFunctions, CubeUtil {
	
	// TODO Add constructors,...
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Define Moves
	
	@Override
	public void up() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void front() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eq() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void st() {
		// TODO Auto-generated method stub
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Define utility functions
	
	@Override
	public void setLeft(Block align) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execAlg(Moves[] alg) {
		// TODO Iterate over Algorith-array and switch-case the Moves
		for (Moves move : alg) {
			switch(move) {
			case B:
				break;
			case Bp:
				break;
			case D:
				break;
			case Dp:
				break;
			case E:
				break;
			case Ep:
				break;
			case F:
				break;
			case Fp:
				break;
			case L:
				break;
			case Lp:
				break;
			case M:
				break;
			case Mp:
				break;
			case R:
				System.out.println(R);
				break;
			case Rp:
				break;
			case S:
				break;
			case Sp:
				break;
			case U:
				break;
			case Up:
				break;
			default:
				System.out.println("Error: Not a valid Move!");
				break;
			}
		}
	}	
}

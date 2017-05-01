
public class WanderingFollowHybrid extends AttackPattern{
IAttackPattern loaded;
	@Override
	public void Movement(Enemy a, int tick) {
		if(a.getDistance() < 200){
			loaded = new Follow();
		}
		else{
			loaded = new Wandering();
		}
		loaded.Movement(a, tick);
		
	}

}


public interface IAttackPattern {
	
	public void Movement(Enemy a, int tick);
	public void setTarget(IGameObject target);
	public IGameObject getTarget();
}

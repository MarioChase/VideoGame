
public abstract class AttackPattern implements IAttackPattern {
	public IGameObject m_target = null;

	public void setTarget(IGameObject target) {
		m_target = target;
	}
	public IGameObject getTarget(){
		return m_target;
	}
}

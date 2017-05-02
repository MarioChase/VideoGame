
public class Wizard extends Hero {


	public Wizard(){
		health = 75;
		mana = 300;
		loadImages("./WizardImages.txt");
	}
	@Override
	public void tick(int maxw, int maxh) {
		// TODO Auto-generated method stub
		if(mana < 300){
			mana += 5;
		}
		m_ticks++;
		m_x += m_dX;
		m_y += m_dY;
		wrapAround(maxw, maxh);
	}

	@Override
	public IGameObject ability1() {
		// TODO Auto-generated method stub
		if((mana - 20) > 0){
		mana -= 20;
		Projectile item = new Fireball();
		item.setConstructor(this.getX(), this.getY(), 50, 50, 0, 0, this.facing);
		return item;}
		else{
			return new NullProjectile();
		}
	}

	@Override
	public IGameObject ability2() {
		// TODO Auto-generated method stub
		if((mana -= 100) > 0){
			mana -= 100;
		switch(this.facing){
		case 0:
			m_x += 100;
			break;
		case 1:
			m_x -= 100;
			break;
		case 2:
			m_y -= 100;
			break;
		case 3:
			m_y += 100;
			break;
		}}
		return new NullProjectile();
	}

	@Override
	public IGameObject ability3() {
		// TODO Auto-generated method stub
		return new NullProjectile();
	}

	
}

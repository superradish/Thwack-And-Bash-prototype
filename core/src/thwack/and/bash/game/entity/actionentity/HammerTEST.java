
package thwack.and.bash.game.entity.actionentity;

import thwack.and.bash.game.collision.CollisionBody;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class HammerTEST extends ActionEntity {

	public HammerTEST (Sprite sprite, CollisionBody body) {
		super(sprite, body);
		iconSprite = new Sprite(new Texture(Gdx.files.internal("hammer.png")));
	}

	private Sprite iconSprite;

	@Override
	public Sprite getIconSprite () {
		return iconSprite;
	}

	@Override
	public void update (float delta) {

	}

}

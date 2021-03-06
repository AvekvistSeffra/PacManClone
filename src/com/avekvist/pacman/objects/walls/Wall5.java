package com.avekvist.pacman.objects.walls;

import com.avekvist.pacman.core.GameObject;
import com.avekvist.pacman.core.graphics.Animation;
import com.avekvist.pacman.core.graphics.Sprite;

import static com.avekvist.pacman.core.graphics.SpriteSheet.graphics;

public class Wall5 extends GameObject {
    Sprite wallSprite;

    public Wall5() {
        wallSprite = new Sprite();
        wallSprite.setAnimation(new Animation(graphics, 4, 4, 12 * 3, 12 * 3, 12 * 3, 12 * 3));
        setSprite(wallSprite);
        setAlive(true);
        setType("Wall");
    }
}

package com.lenovo.service.basicpubliclibrary.loadingart.progress.style;


import com.lenovo.service.basicpubliclibrary.loadingart.progress.sprite.Sprite;
import com.lenovo.service.basicpubliclibrary.loadingart.progress.sprite.SpriteContainer;

/**
 * Created by ybq.
 */
public class MultiplePulse extends SpriteContainer {
    @Override
    public Sprite[] onCreateChild() {
        return new Sprite[]{
                new Pulse(),
                new Pulse(),
                new Pulse(),
        };
    }

    @Override
    public void onChildCreated(Sprite... sprites) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].setAnimationDelay(200 * (i + 1));
        }
    }
}

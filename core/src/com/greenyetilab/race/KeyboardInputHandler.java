package com.greenyetilab.race;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Handle keyboard input, for desktop mode
 */
public class KeyboardInputHandler implements GameInputHandler {
    @Override
    public void updateGameInput(GameInput input) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            input.direction = 1;
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            input.direction = -1;
        }
        input.braking = Gdx.input.isKeyPressed(Input.Keys.SPACE);
        input.accelerating = Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT);
    }
}
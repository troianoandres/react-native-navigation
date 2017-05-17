package com.reactnativenavigation.screens;

import com.reactnativenavigation.params.ScreenParams;

class ScreenAnimatorFactory {

    static ScreenAnimator create(Screen screen, ScreenParams screenParams) {
        ScreenAnimator screenAnimator;
        String animationType = screenParams.screenTransitionAnimationType;

        if (animationType.equals("slide-left")) {
            screenAnimator = new SlideLeftScreenAnimator(screen);
        } else {
            screenAnimator = new SlideUpScreenAnimator(screen);
        }

        return screenAnimator;
    }
}

package dev.lvstrng.argon.module.modules.combat.aura.rotation;

import dev.lvstrng.argon.module.modules.combat.Aura;

public class None implements RotationModeHandler {
   @Override
   public void rotate(Aura aura, boolean ready) {
      Track.rotateClassic(aura, ready);
   }
}
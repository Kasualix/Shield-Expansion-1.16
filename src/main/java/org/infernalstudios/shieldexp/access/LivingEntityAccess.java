/**
 * Copyright 2022 Infernal Studios
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.infernalstudios.shieldexp.access;


import net.minecraft.item.ItemStack;

public interface LivingEntityAccess {

    int getParryWindow();

    void setParryWindow(int parry);

    int getBlockedCooldown();

    void setBlockedCooldown(int block);

    boolean getBlocking();

    void setBlocking(boolean bool);

    int getUsedStamina();

    void setUsedStamina(int stamina);

    ItemStack getLastShield();

    void setLastShield(ItemStack shield);

    static LivingEntityAccess get(Object object) {
        return (LivingEntityAccess) object;
    }

}
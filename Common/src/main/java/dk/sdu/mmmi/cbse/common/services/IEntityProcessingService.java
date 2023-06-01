package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {


     /**
     *
     *
     * @param gameData
     * @param world
     * @throws
     */

    /**
     *Pre-Condition: Time delta have passed
     * Post-condition: The entity will get updated
     */
    void process(GameData gameData, World world);
}

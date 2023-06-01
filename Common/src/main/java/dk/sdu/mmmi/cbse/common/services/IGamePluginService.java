package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IGamePluginService {

    /**
     *Pre-condition: The game have not been initiated
     * Post-condition: The game have been initiated and spawned entities
     */
    void start(GameData gameData, World world);

    /**
     *
     * @param gameData
     * @param world
     * Pre-condition: Game have not yet been stopped
     * Post-condition: Game have been stopped and any entities there was have been removed
     */
    void stop(GameData gameData, World world);
}

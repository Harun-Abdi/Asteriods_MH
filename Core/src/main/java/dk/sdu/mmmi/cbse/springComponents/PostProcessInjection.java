package dk.sdu.mmmi.cbse.springComponents;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.extra.SPILocator;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("postProcessorInjector")
public class PostProcessInjection implements Iprocessing{

    @Override
    public void process(GameData gameData, World world) {
        List<IPostEntityProcessingService> processors = SPILocator.locateAll(IPostEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}

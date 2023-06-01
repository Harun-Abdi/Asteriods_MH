import dk.sdu.mmmi.cbse.collisionsystem.CollisionDetector;
import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollisionDetectorTest {

    private CollisionDetector collisionDetector;

    private Entity entity1;
    private Entity entity2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        collisionDetector = new CollisionDetector();

        PositionPart positionPart1 = new PositionPart(45, 25, 0);
        PositionPart positionPart2 = new PositionPart(50, 30, 0);

        entity1 = new Entity();
        entity2 = new Entity();

        entity1.setRadius(100);
        entity2.setRadius(100);
        entity1.add(positionPart1);
        entity2.add(positionPart2);
    }

    @Test
    void collides() {
        assertEquals(true, collisionDetector.collides(entity1, entity2));
    }
}
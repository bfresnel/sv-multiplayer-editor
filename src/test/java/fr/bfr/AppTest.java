package fr.bfr;

import generated.SaveGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppTest {

    @Test
    public void readSaveGameXML_ThenReturnOk() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(SaveGame.class);
        Unmarshaller u = context.createUnmarshaller();
        SaveGame sg = (SaveGame) u.unmarshal(new FileInputStream("src/test/resources/test_read_xsd_save_game.xml"));

        Assertions.assertEquals("", sg.getPlayer());
        Assertions.assertEquals(SeasonEnum.SPRING.getKey(), sg.getCurrentSeason());
        Assertions.assertEquals("", sg.getLocations());
        Assertions.assertEquals("Les Alfalfas", sg.getSamBandName());
        Assertions.assertEquals("L’ascension et la chute de la planète Yazzo", sg.getElliottBookName());
        Assertions.assertEquals("", sg.getBroadcastedMail());
        Assertions.assertEquals("", sg.getWorldStateIDs());
        Assertions.assertEquals("1", sg.getLostBooksFound());
        Assertions.assertEquals("0", sg.getGoldenWalnuts());
        Assertions.assertEquals("0", sg.getGoldenWalnutsFound());
        Assertions.assertEquals("0", sg.getMiniShippingBinsObtained());
        Assertions.assertFalse(sg.isMineShrineActivated());
        Assertions.assertFalse(sg.isGoldenCoconutCracked());
        Assertions.assertFalse(sg.isParrotPlatformsUnlocked());
        Assertions.assertFalse(sg.isFarmPerfect());
        Assertions.assertEquals("", sg.getFoundBuriedNuts());
        Assertions.assertEquals("-1", sg.getVisitsUntilY1Guarantee());
        Assertions.assertEquals("Default", sg.getShuffleMineChests());
        Assertions.assertEquals("17", sg.getDayOfMonth());
        Assertions.assertEquals("1", sg.getYear());
        Assertions.assertEquals("22", sg.getFarmerWallpaper());
        Assertions.assertEquals("29", sg.getFarmerFloor());
        Assertions.assertEquals("0", sg.getCurrentWallpaper());
        Assertions.assertEquals("3", sg.getCurrentFloor());
        Assertions.assertEquals("1", sg.getCurrentSongIndex());
        Assertions.assertEquals("", sg.getCountdownToWedding());
        Assertions.assertEquals("", sg.getIncubatingEgg());
        Assertions.assertEquals("0.183", sg.getChanceToRainTomorrow());
        Assertions.assertEquals("-0.069", sg.getDailyLuck());
        Assertions.assertEquals("288555781", sg.getUniqueIDForThisGame());
        Assertions.assertFalse(sg.isWeddingToday());
        Assertions.assertFalse(sg.isIsRaining());
        Assertions.assertFalse(sg.isIsDebrisWeather());
        Assertions.assertFalse(sg.isShippingTax());
        Assertions.assertFalse(sg.isBloomDay());
        Assertions.assertFalse(sg.isIsLightning());
        Assertions.assertFalse(sg.isIsSnowing());
        Assertions.assertFalse(sg.isShouldSpawnMonsters());
        Assertions.assertTrue(sg.isHasApplied13UpdateChanges());
        Assertions.assertTrue(sg.isHasApplied14UpdateChanges());
        Assertions.assertEquals("0.75", sg.getMusicVolume());
        Assertions.assertEquals("1", sg.getSoundVolume());
        Assertions.assertEquals("", sg.getCropsOfTheWeek());
        Assertions.assertEquals("", sg.getDishOfTheDay());
        Assertions.assertEquals("4", sg.getHighestPlayerLimit());
        Assertions.assertEquals("0", sg.getMoveBuildingPermissionMode());
        Assertions.assertEquals("", sg.getLocationWeather());
        Assertions.assertEquals("", sg.getBannedUsers());
        Assertions.assertEquals("", sg.getBundleData());
        Assertions.assertEquals("", sg.getLimitedNutDrops());
        Assertions.assertEquals("-120651345193210362", sg.getLatestID());
        Assertions.assertEquals("", sg.getOptions());
        Assertions.assertEquals("", sg.getSplitscreenOptions());
        Assertions.assertEquals("", sg.getCustomData());
        Assertions.assertEquals("", sg.getMinePermanentMineChanges());
        Assertions.assertEquals("11", sg.getMineLowestLevelReached());
        Assertions.assertEquals("0", sg.getMinecartHighScore());
        Assertions.assertEquals("2", sg.getWeatherForTomorrow());
        Assertions.assertEquals("0", sg.getWhichFarm());
        Assertions.assertEquals("-1", sg.getMineLowestLevelReachedForOrder());
        Assertions.assertEquals("0", sg.getSkullCavesDifficulty());
        Assertions.assertEquals("0", sg.getMinesDifficulty());
        Assertions.assertEquals("0", sg.getCurrentGemBirdIndex());
        Assertions.assertEquals("", sg.getJunimoKartLeaderboards());
        Assertions.assertEquals("", sg.getSpecialOrders());
        Assertions.assertEquals("", sg.getAvailableSpecialOrders());
        Assertions.assertEquals("", sg.getCompletedSpecialOrders());
        Assertions.assertEquals("", sg.getAcceptedSpecialOrderTypes());
        Assertions.assertEquals("", sg.getReturnedDonations());
        Assertions.assertEquals("", sg.getJunimoChest());
        Assertions.assertEquals("", sg.getCollectedNutTracker());
        Assertions.assertEquals("", sg.getFarmerFriendships());
        Assertions.assertEquals("", sg.getCellarAssignments());
        Assertions.assertEquals("35", sg.getLastAppliedSaveFix());
        Assertions.assertEquals("1.5.4", sg.getGameVersion());
    }
}

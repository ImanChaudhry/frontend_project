package com.bnta.dragonball_api.components;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import com.bnta.dragonball_api.models.Technique;
import com.bnta.dragonball_api.repositories.PersonRepository;
import com.bnta.dragonball_api.repositories.SagaRepository;
import com.bnta.dragonball_api.repositories.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    SagaRepository sagaRepository;
    @Autowired
    TechniqueRepository techniqueRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Comment TO REMOVE

        //Dragon ball sagas
        Saga sonGokuSaga = new Saga("Son Goku Saga", Series.DragonBall, "1 - 28", "https://dragonball.guru/wp-content/uploads/2021/03/goku-profile-e1616173641804.png",
                LocalDate.of(2001, 8, 20));

//        Saga redRibbonArmySaga = new Saga("Red Ribbon Army Saga", Series.DragonBall, "29 - 83",
//                LocalDate.of(2002, 2, 11));

        Saga piccoloSaga = new Saga("Piccolo Saga", Series.DragonBall, "84 - 153","https://dragonball.guru/wp-content/uploads/2021/03/Piccolo-Profile-Pic-300x300.png",
                LocalDate.of(2002, 12, 5));

        // Dragon ball Z sagas
        Saga saiyanSaga = new Saga("Saiyan Saga", Series.DragonBall_Z,"1 - 35","https://dragonball.guru/wp-content/uploads/2022/06/Zeno-Profile-Pic-300x300.png",
                LocalDate.of(1996,9,13));


        Saga friezaSaga = new Saga("Frieza Saga", Series.DragonBall_Z, "36 - 117", "https://dragonball.guru/wp-content/uploads/2021/03/frieza-profile-e1616174138632.png",
                LocalDate.of(1997,9,13));


        Saga cellSaga = new Saga("Cell Saga", Series.DragonBall_Z, "118 - 194", "https://dragonball.guru/wp-content/uploads/2021/03/SeekPng.com_dbz-aura-png_1978081-e1619044254898-768x768.png",
                LocalDate.of(2000,9,4));

        Saga majinBuuSaga = new Saga("Majin Buu Saga", Series.DragonBall_Z, "195 - 291", "https://dragonball.guru/wp-content/uploads/2021/03/pngarea.com_kid-buu-png-1410072-e1619048346991.png",
                LocalDate.of(2001, 9, 10));


//        //Dragon ball Super
//        Saga godsOfTheUniverseSaga = new Saga("Gods of the Universe Saga", Series.DragonBall_Super, "1 - 27",
//                LocalDate.of(2017, 1, 7));
//
//        Saga zenoSaga = new Saga("Zeno Saga", Series.DragonBall_Super, "28 - 131",
//                LocalDate.of(2017, 8, 5));
//
//
//        //Dragon ball GT
//        Saga grandTourSaga = new Saga("Grand Tour Saga", Series.DragonBall_GT, "1- 64",
//                LocalDate.of(2005, 2 ,5 ));


        sagaRepository.saveAll(Arrays.asList(sonGokuSaga, piccoloSaga,
                saiyanSaga, friezaSaga, cellSaga, majinBuuSaga));
//                                             godsOfTheUniverseSaga, zenoSaga,
//                                             grandTourSaga

        // Shared Techniques
//        Technique flight = new Technique("Flight","Movement");
        Technique kamehameha = new Technique("Kamehameha", "Beam");
//        Technique instantTransmission = new Technique("Instant Transmission", "Teleportation");
        Technique spiritBomb = new Technique("Spirit Bomb","Energy Sphere"); //Cell, Goku
//        Technique eyeLaser = new Technique("Eye Laser","Beam"); //Cell (And loads of others...)
        Technique afterImage = new Technique("Afterimage","Movement");
        Technique fusionDance = new Technique("Fusion Dance","Transformation");
        Technique fullPowerEnergyWave = new Technique("Full Power Energy Wave", "Energy Wave");
//        Technique highSpeedRush = new Technique("High Speed Rush", "Rush Attack");
        Technique fullPowerCharge = new Technique("Full Power Charge", "Power Up");
        Technique explosiveWave = new Technique("Explosive Wave", "Energy Shield");
        Technique fullPowerEnergyBall = new Technique("Full Power Energy Ball", "Energy Sphere");
//        Technique pumpUp = new Technique("Pump up", "Power Up");
//        Technique highPowerRush = new Technique("High Power Rush", "Rush Attack");
//        Technique superMouthBlast = new Technique("Super Mouth Blast", "Energy Wave");
//        Technique telekinesis = new Technique("Telekinesis", "Restraining");
//        Technique psychicRockThrow = new Technique("Psychic Rock Throw", "Telekinesis");
        Technique masenko = new Technique("Masenko","Beam"); //Piccolo, Gohan ...
//        Technique dodonRay = new Technique("Dodon Ray", "Beam"); // Tien, ....
        //
        Technique fullPower = new Technique("Full Power", "Power up");
//        Technique fullPowerEnergyBlastVolley = new Technique("Full Power Energy Blast Volley", "Continuous Energy Blast" );
//        Technique kiBlastCannon = new Technique("Ki Blast Cannon", "Energy Wave");
        Technique superExplosiveWave = new Technique("Super Explosive Wave", "Explosive Wave");
        Technique antennaBeam = new Technique("Antenna Beam", "Energy Wave");
        Technique explosiveDemonWave = new Technique("Explosive Demon Wave", "Energy Wave");
//        Technique stoneBullet = new Technique("Stone Bullet", "projectile");
//        Technique giganticRockThrow = new Technique("Gigantic Rock Throw", "Offensive");
        Technique hikou = new Technique("Hikou", "Movement");
//        Technique rockPaperScissors = new Technique("Rock Paper Scissors","Rush");


        // Yajirobe
        Technique mircaleKaBlamSlash = new Technique("Miracle Ka-Blam Slash", "Rush Attack");

        // Goku Techniques
//        Technique powerPole = new Technique("Power pole", "Rush"); //early goku
//        Technique triBeam = new Technique("Tri-Beam", "Beam"); //Tien
        Technique kaioken = new Technique("Kaio-ken","Power Up"); //Goku from saiyan sage onwards
        Technique kaiokenAttack = new Technique("Kaio-ken Attack","Rush Attack"); //Goku from saiyan sage onwards
        // Gohan Techniques
//        Technique leaveMyDaddyAlone = new Technique("Leave My Daddy Alone!","Rush"); //Gohan (Very young)
//        Technique hiddenPotential = new Technique("Hidden Potential","Beam"); //Gohan (Very young)
//        Technique gekiretsuMadan = new Technique("Gekiretsu Madan","Beam");
        Technique masendan = new Technique("Masendan","Beam");
        Technique wildRushBlaster = new Technique("Wild Rush Blaster","Beam");

        // Cells Techniques
        Technique absorption = new Technique("Absorption","Support");
        // Tien Techniques
        Technique fourWitches = new Technique("Four Witches","Rush");
        Technique neoTriBeam = new Technique("Neo Tri-Beam", "Continuous Energy Bullet");

        // Piccolo Techniques
        Technique demonHand = new Technique("Demon Hand","Rush");
        Technique specialBeamCannon = new Technique("Special Beam Cannon","Beam");

        // Master Roshi Techniques
        Technique drunkenFist = new Technique("Drunken Fists","Rush");
        Technique thunderShockSurprise = new Technique("Thunder Shock Surprise","Beam");
        Technique theOriginalKamehameha = new Technique("The Original Kamehameha", "Energy Wave");


        // Frieza Techniques
//        Technique deathBeam = new Technique("Death Beam", "Beam");
        Technique deathCannon = new Technique("Death Cannon", "Beam");
        Technique deathSaucer = new Technique("Death Saucer", "Disc");
//        Technique novaStrike = new Technique("Nova Strike", "Rush");
        // Yamcha Techniques
        Technique wolfFangFist = new Technique("Wolf Fang Fist","Rush");
        Technique spiritBall = new Technique("Spirit Ball","Beam");
        // Nappa Techniques
        Technique volcanoExplosion = new Technique("Volcano Explosion","Exploding wave");
        // Raditz Techniques
//        Technique saturdayCrush = new Technique("Saturday Crush","Energy Sphere");
        Technique behindYou = new Technique("Behind You!","Rush");
        Technique begone = new Technique("Begone!","Beam");
        // Trunks Techniques
        Technique doubleBuster = new Technique("Double Buster","Beam");
        Technique busterCannon = new Technique("Buster Cannon","Beam");
//        Technique godBreak = new Technique("God Breaker","Beam");
        // Krillin Techniques
        Technique bestHeadbutt = new Technique("Best Headbutt","Rush");
        Technique destructoDisc = new Technique("Destructo Disc","Disc");
//        Technique scatteringBullet = new Technique("Scattering Bullet","Bullet");
//        Technique doubletsuibikidan = new Technique("Double Tsuibikidan", "Beam");
//        Technique solarFlare = new Technique("Solar Flare","Supportive");
        // Vegeta Techniques
        Technique galickGun = new Technique("Galick Gun", "Beam");
//        Technique lucoraGun = new Technique("Lucora Gun","Continuous Energy Bullet");
//        Technique bigBangAttack = new Technique("Big Bang Attack","Beam");
        Technique finalImapct = new Technique("Final Impact","Beam");
        // Android Techniques
//        Technique hellsFlash = new Technique("Hells Flash","Beam"); //Android 16
        Technique machineImpact = new Technique("Machine Impact","Beam"); //Android 16
        Technique hellBreaker = new Technique("Hell Breaker","Beam"); //Android 17
        Technique powerBlitz = new Technique("Power Blitz", "Beam"); //Android 18 and 17
//        Technique selfDestructDevice = new Technique("Self Destruct device", "Suicide"); //Android 8
//        Technique eighterAttack = new Technique("Eighter Attck", "Rush"); //Android 8
        // Ginuy Force Techniques
        Technique bodyChange = new Technique("Body Change","Supportive"); //Captain Ginyu
        Technique monsterForm = new Technique("Monster Form", "Transformation");
        // Buu Techniques
//        Technique bodyManipulation = new Technique("Body Manipulation","Rush"); //Kid Buu
        Technique transfigurationBeam = new Technique("Transfiguration Beam","Beam"); //All buus?

        // Mecenary Tao Techniques
//        Technique craneStyleAssassinStrike = new Technique("Crane Style Assassin Strike", "Rush");
//        Technique pressurePointAttack = new Technique("Pressure Point Attack", "Rush");
        // Super Saiyan Transformations
//        Technique SSJ1 = new Technique("Super Saiyan 1", "Transformation"); //Loads
//        Technique SSJ2 = new Technique("Super Saiyan 2", "Transformation"); //Loads
//        Technique SSJ3 = new Technique("Super Saiyan 3", "Transformation"); //Loads
        // Cells Transformations
//        Technique imperfectForm = new Technique("Imperfect Form", "Transformation");
//        Technique semiPerfectForm = new Technique("Semi-Perfect Form", "Transformation");
//        Technique perfectForm = new Technique("Perfect Form", "Transformation");
        Technique superPerfectForm = new Technique("Super Perfect Form", "Transformation");
        // Frieza Transformations
//        Technique firstForm = new Technique("First Form", "Transformation");
//        Technique secondForm = new Technique("Second Form", "Transformation");
//        Technique thirdForm = new Technique("Third Form", "Transformation");
//        Technique finalForm = new Technique("Final Form", "Transformation");
//        Technique finalForm100 = new Technique("100% Final Form", "Transformation");

        //
//        Technique greatSaiyaman = new Technique("Great Saiyaman", "Transformation"); // MajinBuusaga Gohan
//        Technique potaraVegito = new Technique("Potara: Vegito (w/Vegeta)", "Transformation"); //MajinBuusaga Goku
//        Technique greatApe = new Technique("Great Ape", "Transformation"); // kid Goku in dragon ball
//        Technique maxPower = new Technique("Max Power", "Transformation"); // Master Roshi

        //Chiaotzu Technique
        Technique farewellMrTien = new Technique("Farewell, Mr. Tien",  "Self Destruction");

        //Saibaman Technique
//        Technique saibamenBomb = new Technique("Saibamen Bomb", "Self Destruction"); //removed_bc_no_pic
//        Technique acid = new Technique("Acid", "Rush Attack"); //removed_bc_no_pic

        //Dende Technique
//        Technique healing = new Technique("Healing","Support"); //removed_bc_no_pic


        techniqueRepository.saveAll(Arrays.asList(kamehameha, galickGun,
                powerBlitz, deathCannon, deathSaucer, bestHeadbutt, destructoDisc, finalImapct,
                transfigurationBeam, demonHand, specialBeamCannon, masenko, doubleBuster, busterCannon,
                fourWitches, afterImage, drunkenFist,
                thunderShockSurprise, spiritBomb, absorption, wolfFangFist, spiritBall,
                machineImpact, hellBreaker, fusionDance, volcanoExplosion, behindYou,
                begone, bodyChange, kaioken, superPerfectForm,
                fullPowerEnergyWave, fullPowerCharge, explosiveWave, fullPowerEnergyBall,
                farewellMrTien, fullPower,theOriginalKamehameha, neoTriBeam, superExplosiveWave,
                kaiokenAttack, explosiveDemonWave, antennaBeam, mircaleKaBlamSlash, hikou,
                monsterForm, wildRushBlaster, masendan));

        //Dragon ball - Son Goku Characters
        Person gokuSonGokuSaga = new Person(Series.DragonBall, "Goku", 13, "Planet Vegeta",
                "Saiyan", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/goku-profile-e1616173641804.png", Arrays.asList(kamehameha,afterImage));
        Person bulmaSonGokuSaga = new Person(Series.DragonBall, "Bulma", 16, "Earth",
                "Saiyan", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/bulma-profile-768x768.png ", Arrays.asList());
        Person chichiSonGokuSaga = new Person(Series.DragonBall, "Chi-Chi", 12, "Earth",
                "Saiyan", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Chi-Chi-Profile-Pic-768x768.png", Arrays.asList());
        Person krillinSonGokuSaga = new Person(Series.DragonBall, "Krillin", 14, "Earth",
                "Human", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/krillin-profile-1-768x768.png", Arrays.asList(afterImage));
        Person yamchaSonGokuSaga = new Person(Series.DragonBall, "Yamcha", 17, "Earth",
                "Human", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/yamcha-profile-e1616269253412.png", Arrays.asList(wolfFangFist));
        Person roshiSonGokuSaga = new Person(Series.DragonBall, "Master Roshi", 320, "Earth",
                "Human", sonGokuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Master-Roshi-Profile-e1619557066925.png", Arrays.asList(kamehameha,afterImage));
//        Person launchSonGokuSaga = new Person(Series.DragonBall, "Launch", 17, "Earth",
//                "Human", sonGokuSaga, Arrays.asList()); //no_pic
//        Person namSonGokuSaga = new Person(Series.DragonBall, "Nam", 29, "Earth",
//                "Human", sonGokuSaga, Arrays.asList(afterImage)); //no_pic
//        Person giranSonGokuSaga = new Person(Series.DragonBall, "Giran", 33, "Unknown",
//                "Giras", sonGokuSaga, Arrays.asList()); //no_pic

        // Dragon ball - red ribbon army
//        Person boraRedRibbonArmySaga = new Person(Series.DragonBall, "Bora", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person android8RedRibbonArmySaga = new Person(Series.DragonBall, "Android 8", 0, "Earth",
//                "Android", redRibbonArmySaga, Arrays.asList(selfDestructDevice, eighterAttack)); //no_pic
//        Person generalBlue = new Person(Series.DragonBall, "General Blue", 28, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person bandagesTheMummy= new Person(Series.DragonBall, "Bandages The Mummy", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person masterRoshiRedRibbonArmySaga = new Person(Series.DragonBall, "Master Roshi", 320, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList(kamehameha, thunderShockSurprise, drunkenFist));
//        Person akkumanRedRibbonArmySaga = new Person(Series.DragonBall, "Akkuman", 0, "Earth",
//                "Devil", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person mercenaryTaoRedRibbonArmySaga = new Person(Series.DragonBall, "Mercenary Tao", 291, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList(dodonRay, pressurePointAttack, craneStyleAssassinStrike));
//        Person korinRedRibbonArmySaga = new Person(Series.DragonBall, "Korin", 800, "Earth",
//                "Cat", redRibbonArmySaga, Arrays.asList(flight, afterImage)); //no_pic
//        Person kidGokuRedRibbonArmySaga = new Person(Series.DragonBall, "Kid Goku", 12, "Planet Vegeta",
//                "Saiyan", redRibbonArmySaga, Arrays.asList(powerPole, kamehameha));
//        Person grandpaGohanRedRibbonArmySaga = new Person(Series.DragonBall, "Grandpa Gohan", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList());
//        Person commanderRed = new Person(Series.DragonBall, "Commander Red", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person ninjaMurasaki = new Person(Series.DragonBall, "Ninja Murasaki", 35, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person colonelSilver = new Person(Series.DragonBall, "Colonel Silver", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person generalWhite = new Person(Series.DragonBall, "generalWhite", 0, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList()); //no_pic
//        Person krillinRedRibbonArmySaga = new Person(Series.DragonBall, "Krillin", 13, "Earth",
//                "Earthling", redRibbonArmySaga, Arrays.asList(afterImage)); //already_used

        // Dragon ball  - Piccolo saga characters
//        Person yamcha = new Person(Series.DragonBall, "Yamcha", 23, "Earth",
//                "Human", piccoloSaga, Arrays.asList(spiritBall,wolfFangFist,kamehameha)); //already_used
//
//        Person bulma = new Person(Series.DragonBall, "Bulma", 23, "Earth", "Human", piccoloSaga,
//                Arrays.asList()); //already_used
//
//        Person chiChi = new Person(Series.DragonBall, "Chi-Chi", 19, "Earth", "Human", piccoloSaga,
//                Arrays.asList()); //already_used

        Person piccolo = new Person(Series.DragonBall, "Piccolo", 3, "Namek", "Namekian", piccoloSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Piccolo-Profile-Pic-768x768.png",
                Arrays.asList(afterImage));

//        Person goku = new Person(Series.DragonBall, "Goku", 18, "Planet Vegeta", "Saiyan", piccoloSaga,
//                Arrays.asList()); //already_used

        Person chiaotzu = new Person(Series.DragonBall, "Chiaotzu", 18, "Earth", "Human", piccoloSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Chiaotzu-Profile-Pic.png",
                Arrays.asList());

        Person tienShinhan = new Person(Series.DragonBall, "Tien Shinhan", 23, "Earth", "Earthling/Cyclops", piccoloSaga, "https://dragonball.guru/wp-content/uploads/2021/03/tien-e1619050541929.png",
                Arrays.asList(fourWitches));

        Person yajirobe = new Person(Series.DragonBall, "Yajirobe", 21, "Earth", "Human", piccoloSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Yajirobe-Profile-Pic.png",
                Arrays.asList());

//        Person oolong = new Person(Series.DragonBall, "Oolong", 16, "Earth", "Animal type Earthling",
//                piccoloSaga,
//                Arrays.asList()); //no_pic

//        Person kami = new Person(Series.DragonBall, "Kami", 495, "Namek", "Namekian", piccoloSaga,
//                Arrays.asList()); //no_pic
//
//        Person paur = new Person(Series.DragonBall, "Paur", 13, "Earth", "Animal type Earthling", piccoloSaga,
//                Arrays.asList()); //no_pic

//        Person masterRoshi = new Person(Series.DragonBall, "Master Roshi", 326, "Earth", "Human", piccoloSaga,
//                Arrays.asList(kamehameha,afterImage)); //already_used
//
//        Person krillinPiccoloSaga= new Person(Series.DragonBall, "Krillin", 20, "Earth",
//                "Human", piccoloSaga, Arrays.asList(kamehameha,afterImage,solarFlare)); //already_used

        // Dragon ball Z - Saiyan saga
//        Person saibamanSaiyanSaga = new Person(Series.DragonBall_Z, "Saibaman", 0, "Planet Vegeta", "Alien",
//                saiyanSaga, Arrays.asList(acid, afterImage, fullPowerEnergyWave, highSpeedRush, saibamenBomb)); //no_pic

//        Person yajirobeSaiyanSaga = new Person(Series.DragonBall_Z, "Yajirobe", 26, "Earth", "Human",
//                saiyanSaga, Arrays.asList(stoneBullet, giganticRockThrow, hikou, mircaleKaBlamSlash)); //already_used

//        Person gohanSaiyanSaga = new Person(Series.DragonBall_Z, "Kid Gohan", 4, "Earth", "Saiyan/Human",
//                saiyanSaga, Arrays.asList(fullPowerCharge, explosiveWave, fullPowerEnergyBall, highSpeedRush, masenko, hiddenPotential));

//        Person bulmaSaiyanSaga = new Person(Series.DragonBall_Z, "Bulma", 28, "Earth", "Human",
//                saiyanSaga, Arrays.asList()); //already_used

        Person nappaSaiyanSaga = new Person(Series.DragonBall_Z, "Nappa", 50, "Planet Vegeta", "Saiyan",
                saiyanSaga, "https://dragonball.guru/wp-content/uploads/2021/03/nappa-profile-pic.png", Arrays.asList(fullPowerCharge, fullPowerEnergyWave, volcanoExplosion));

//        Person chiaotzuSaiyanSaga = new Person(Series.DragonBall_Z, "Chiaotzu", 23, "Earth", "Human",
//                saiyanSaga, Arrays.asList(telekinesis, fullPowerCharge, dodonRay, psychicRockThrow, farewellMrTien)); //already_used

        Person raditzSaiyanSaga = new Person(Series.DragonBall_Z, "Raditz", 29, "Planet Vegeta", "Saiyan",
                saiyanSaga, "https://dragonball.guru/wp-content/uploads/2021/03/raditz-profile-e1624031860619.png", Arrays.asList(fullPower, behindYou, begone, fullPowerEnergyWave));

//        Person masterRoshiSaiyanSaga = new Person(Series.DragonBall_Z, "Master Roshi", 331, "Earth", "Human",
//                saiyanSaga, Arrays.asList(afterImage, pumpUp, theOriginalKamehameha, highSpeedRush,thunderShockSurprise)); //already_used

//        Person yamchaSaiyanSaga = new Person(Series.DragonBall_Z, "Yamcha", 28, "Earth", "Human",
//                saiyanSaga, Arrays.asList(fullPowerCharge, afterImage, kamehameha, wolfFangFist, spiritBall)); //already_used

//        Person tienSaiyanSaga = new Person(Series.DragonBall_Z, "Tien Shinhan", 28, "Earth", "Earthling/Cyclops",
//                saiyanSaga, Arrays.asList(solarFlare, afterImage, dodonRay,neoTriBeam)); //already_used

        Person vegetaSaiyanSaga = new Person(Series.DragonBall_Z, "Vegeta", 29, "Planet Vegeta", "Saiyan",
                saiyanSaga, "https://dragonball.guru/wp-content/uploads/2021/03/vegeta-profile.png", Arrays.asList(explosiveWave, fullPower, galickGun, superExplosiveWave ));

//        Person gokuSaiyanSaga = new Person(Series.DragonBall_Z, "Goku", 24, "Planet Vegeta", "Saiyan",
//                saiyanSaga, Arrays.asList(solarFlare, kaioken, kamehameha, kaiokenAttack)); //already_used

//        Person kingKaiSaiyanSaga = new Person(Series.DragonBall_Z, "King Kai", 0, "King Kai's Planet", "Core Person",
//                saiyanSaga, Arrays.asList()); //unsure - website has supreme kai & grand kai, but not king

//        Person piccoloSaiyanSaga = new Person(Series.DragonBall_Z, "Piccolo", 8, "Namek", "Namekian",
//                saiyanSaga, Arrays.asList(antennaBeam, fullPower, specialBeamCannon, explosiveDemonWave)); //already_used
//
//        Person krillinSaiyanSaga = new Person(Series.DragonBall_Z, "Krillin", 25, "Earth", "Human",
//                saiyanSaga, Arrays.asList(solarFlare, afterImage, scatteringBullet, fullPowerEnergyBlastVolley, destructoDisc)); //already_used

        // Dragon ball Z - Frieza saga
//        Person krillinFriezaSaga = new Person(Series.DragonBall_Z, "Krillin", 26, "Earth",
//                "Human", friezaSaga, Arrays.asList(afterImage, destructoDisc, solarFlare,
//                bestHeadbutt, doubletsuibikidan)); //already_used
//
//        Person yajirobeFriezaSaga = new Person(Series.DragonBall_Z, "Yajirobe", 27, "Earth",
//                "Human", friezaSaga, Arrays.asList()); //already_used

//        Person dendeFriezaSaga = new Person(Series.DragonBall_Z, "Dende", 26, "Namek",
//                "Namekian", friezaSaga, Arrays.asList(healing)); //no_pic

//        Person gohanFriezaSaga = new Person(Series.DragonBall_Z, "Gohan", 5, "Earth",
//                "Saiyan/Human", friezaSaga, Arrays.asList(masendan, leaveMyDaddyAlone, wildRushBlaster,
//                gekiretsuMadan)); //already_used
//
//        Person piccoloFriezaSaga = new Person(Series.DragonBall_Z, "Piccolo", 9, "Namek",
//                "Namekian", friezaSaga, Arrays.asList(demonHand)); //already_used

//        Person kingKaiFriezaSaga = new Person(Series.DragonBall_Z, "King Kai", 0, "King Kai's Planet",
//                "Core Person", friezaSaga, Arrays.asList()); //unsure - website has supreme kai & grand kai, but not king

//        Person bulmaFriezaSaga = new Person(Series.DragonBall_Z, "Bulma", 29, "Earth",
//                "Human", friezaSaga, Arrays.asList()); //already_used

// Frieza saga / Ginyu Forces members
//        Person recoome = new Person(Series.DragonBall_Z, "Recoome", 0, "Unknown",
//                "Alien", friezaSaga, Arrays.asList()); //no_pic

//        Person burter = new Person(Series.DragonBall_Z, "Burter", 0, "Unknown",
//                "Alien", friezaSaga, Arrays.asList()); //no_pic
//
//        Person jeice = new Person(Series.DragonBall_Z, "Jeice", 0, "Planet Brench",
//                "Alien", friezaSaga, Arrays.asList()); //no_pic
//
//        Person guldo = new Person(Series.DragonBall_Z, "Guldo", 0, "Bas",
//                "Boulean", friezaSaga, Arrays.asList()); //no_pic

        Person captainGinyu = new Person(Series.DragonBall_Z, "Captain Ginyu", 0, "Unknown",
                "Alien", friezaSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Captain-Ginyu-Profile-Pic-768x768.png", Arrays.asList(bodyChange));

        Person zarbon = new Person(Series.DragonBall_Z, "Zarbon", 0, "Unknown",
                "Alien", friezaSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Zarbon-Profile-Pic.png ",Arrays.asList(monsterForm));

//        Person gokuFriezaSaga = new Person(Series.DragonBall_Z, "Goku", 23, "Planet Vegeta",
//                "Saiyan",friezaSaga, Arrays.asList(kamehameha, SSJ1, instantTransmission, spiritBomb)); //already_used

//        Person vegetaFriezaSaga = new Person(Series.DragonBall_Z, "Vegeta", 29, "Planet Vegeta",
//                "Saiyan",
//                friezaSaga, Arrays.asList(galickGun, lucoraGun)); //already_used

        Person frieza = new Person(Series.DragonBall_Z, "Frieza", 32, "Unknown","Alien",
                friezaSaga, "https://dragonball.guru/wp-content/uploads/2021/03/frieza-profile-e1616174138632.png ", Arrays.asList(deathCannon, deathSaucer));

        // Dragon ball Z - Cell saga
//        Person teenGohan = new Person(Series.DragonBall_Z, "Teen Gohan", 10, "Earth",
//                "Saiyan/Human", cellSaga, Arrays.asList(kamehameha, SSJ1, SSJ2)); //already_used

//        Person vegetaCellSaga = new Person(Series.DragonBall_Z, "Vegeta",48,"Planet Vegeta",
//                "Saiyan", cellSaga, Arrays.asList(bigBangAttack, galickGun, SSJ1)); //already_used

        Person futureTrunks = new Person(Series.DragonBall_Z, "Future Trunks", 18, "Earth",
                "Saiyan/Human", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/future-trunks-profile-pic.png", Arrays.asList(busterCannon));

        Person cell = new Person(Series.DragonBall_Z, "Cell", 6, "Earth",
                "Android", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/SeekPng.com_dbz-aura-png_1978081-e1619044254898-768x768.png", Arrays.asList(superPerfectForm, kamehameha));

//        Person gokuCellSaga = new Person(Series.DragonBall_Z, "Goku", 30, "Planet Vegeta",
//                "Saiyan", cellSaga, Arrays.asList(instantTransmission, SSJ1, kamehameha, afterImage)); //already_used

        Person android18 = new Person(Series.DragonBall_Z, "Android 18", 3, "Earth",
                "Android", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/android-18-profile-pic.png", Arrays.asList(powerBlitz));

        Person android17 = new Person(Series.DragonBall_Z, "Android 17", 3, "Earth",
                "Android", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Android-17-Profile-Pic.png", Arrays.asList(hellBreaker, powerBlitz));

        Person android16 = new Person(Series.DragonBall_Z, "Android 16", 3, "Earth",
                "Android", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Android-16-Profile-Pic-300x300.png", Arrays.asList(machineImpact));

//        Person krillinCellSaga = new Person(Series.DragonBall_Z, "Krillin", 31, "Earth",
//                "Human", cellSaga, Arrays.asList()); //already_used

//        Person piccoloCellSaga = new Person(Series.DragonBall_Z, "Piccolo", 14, "Namek",
//                "Namekian", cellSaga, Arrays.asList(eyeLaser, demonHand)); //already_used
//
//        Person tienCellSaga = new Person(Series.DragonBall_Z, "Tien Shinhan", 34, "Earth",
//                "Earthling/Cyclops", cellSaga,Arrays.asList()); //already_used

//        Person dendeCellSaga = new Person(Series.DragonBall_Z, "Dende", 6, "Namek",
//                "Namekian", cellSaga, Arrays.asList()); //no_pic

//        Person mrPopoCellSaga = new Person(Series.DragonBall_Z, "Mr Popo", 1000, "Earth",
//                "Genie", cellSaga, Arrays.asList()); //no_pic

//        Person chiaotzuCellSaga = new Person(Series.DragonBall_Z, "Chiaotzu", 29, "Earth",
//                "Human", cellSaga, Arrays.asList()); //already_used

        Person trunksCellSaga = new Person(Series.DragonBall_Z, "Trunks", 1, "Earth",
                "Saiyan/Human", cellSaga, "https://dragonball.guru/wp-content/uploads/2021/03/Trunks-Profile-Pic.png", Arrays.asList());

        //Majin Buu Saga
//        Person gokuMajinBuuSaga = new Person(Series.DragonBall_Z, "Goku", 37, "Planet Vegeta",
//                "Saiyan", majinBuuSaga, Arrays.asList(instantTransmission, SSJ1, SSJ2, SSJ3, spiritBomb, potaraVegito)); //already_used
        Person gotenMajinBuuSaga = new Person(Series.DragonBall_Z, "Goten", 7, "Earth",
                "Saiyan/Human", majinBuuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/goten-profile-pic-768x768.png", Arrays.asList(fusionDance));
//        Person trunksMajinBuuSaga = new Person(Series.DragonBall_Z, "Trunks", 8, "Earth",
//                "Saiyan/Human", majinBuuSaga, Arrays.asList(fusionDance)); //already_used
//        Person gotenksMajibBuuSaga = new Person(Series.DragonBall_Z, "Gotenks", 8, "Earth",
//                "Saiyan/Human", majinBuuSaga, Arrays.asList(doubleBuster)); //maybe
        Person majinBuu = new Person(Series.DragonBall_Z, "Majin Buu", 5000000, "Earth",
                "Majin/Core Person", majinBuuSaga, "https://dragonball.guru/wp-content/uploads/2021/03/pngarea.com_kid-buu-png-1410072-e1619048346991.png", Arrays.asList(transfigurationBeam));

        //Search for Babidi's planet
//        Person babidi = new Person(Series.DragonBall_Z, "Babidi", 5000000, "Unknown",
//                "Babidis race - Alien Type", majinBuuSaga, Arrays.asList()); //no_pic
//        Person gohanMajinBuuSaga = new Person(Series.DragonBall_Z, "Gohan", 17, "Earth",
//                "Saiyan/Human", majinBuuSaga, Arrays.asList(greatSaiyaman, SSJ1, SSJ2, kamehameha )); //already_used
        Person mrSatanMajinBuuSaga = new Person(Series.DragonBall_Z, "Mr Satan", 38, "Earth",
                "Human", majinBuuSaga, "https://dragonball.guru/wp-content/uploads/2021/04/Mr-Satan-Hercule-Profile-Pic.png", Arrays.asList());
//        Person majinVegeta = new Person(Series.DragonBall_Z, "Majin Vegeta", 48, "Planet Vegeta", "Saiyan",
//                majinBuuSaga, Arrays.asList(finalImpact)); //no_pic

        personRepository.saveAll(Arrays.asList(gokuSonGokuSaga, bulmaSonGokuSaga, chichiSonGokuSaga,krillinSonGokuSaga,yamchaSonGokuSaga, roshiSonGokuSaga,
                piccolo, chiaotzu, tienShinhan, yajirobe,
                nappaSaiyanSaga, raditzSaiyanSaga, vegetaSaiyanSaga,
                captainGinyu, zarbon, frieza,
                futureTrunks, cell, android18, android17, android16, trunksCellSaga,
                gotenMajinBuuSaga,majinBuu, mrSatanMajinBuuSaga));

    }

}

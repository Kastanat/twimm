# twimm
# 1. Case 
Taiga-Urho opiskelija tahtoo löytää koulusta samoista asioista kiinnostuneita ihmisiä, joista saada kavereita ja joiden kanssa voisi tehdä koulutehtäviä ja projekteja. Taiga-Urho on hieman ujo eikä uskalla lähestyä vieraita ihmisiä ja ei myöskään tiedä ketä kannattaisi lähestyä. Taiga-Urhon mielestä on helpompi tutustua ihmisiin netissä, mutta sellaista palvelua ei ole, josta löytää koulun sisältä samoista asioista kiinnostuneita henkilöitä. Taiga-Urho haluaa palvelun, joka käyttäminen on helppoa ja nopeaa. 

# 2. Use Case

Use Case Diagram

![Use Case Diagram](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/UseCaseDiagram.PNG)


# 3. Käyttötapaukset

Käyttötapaus: Kiinnostusten listaus
Toimijat: Käyttäjä
Esiehto:-
Lopputulos:Käyttäjän kiinnostuksen kohteet on listattu ja näkyvät käyttäjälle
Käyttötiheys: 50 kertaa päivässä

1. KT tuo yksitellen kiinnostuksen kohteet ruudulle
2. Käyttäjä valitsee kiinnostaako häntä listan kohteet, kyllä - ei. 
	V2 Käyttäjä keskeyttää kiinnostustensa listauksen
3. KT näyttää käyttäjän kiinnostuksen kohteet 
4. KT loppuu


Käyttötapaus: Profiilin luonti
Toimijat: Käyttäjä 
Esiehto: Käyttötapausta on kutsuttu toisesta käyttötapauksesta, kiinnostusten listaus tehtynä
Lopputulos: Profiilin luonti palveluun valmis
Käyttötiheys: 47 kertaa päivässä

1. KT tuo profiilin luonti-lomakkeen ruudulle
2. Käyttäjä täyttää tiedot ja lähettää lomakkeen
	P1 Virheilmoitus “Sähköpostiosoitteen pitää olla oikeassa muodossa”
	P2 Virheilmoitus “Lomakkeessa ei saa olla tyhjiä kenttiä”
 	V2 Käyttäjä keskeyttää lomakkeen täyttämisen
3. KT loppuu


Käyttötapaus: Muiden käyttäjien profiilien selaus
Toimijat: Käyttäjä
Esiehto: Profiilin luonti pitää olla tehtynä ja profiilin tiedot löytyvät kannasta
Lopputulos: Kiinnostavien profiilien löytäminen
Käyttötiheys: 70 kertaa päivässä

1. KT tuo käyttäjän profiilisivun näkyviin ruudulle ja näyttää käyttäjän kiinnostuksia vastaavat profiilit
2. Käyttäjä selaa profiileja kunnes löytää kiinnostavia käyttäjiä
	V2 käyttäjä keskeyttää profiilien selauksen
3. KT loppuu

Käyttötapaus: Järjestelmään kirjautuminen
Toimijat: Käyttäjä
Esiehto: Profiilin luonti KT pitää olla tehtynä ja profiilin löydyttävä kannasta
Lopputulos: Käyttäjä on onnistuneesti kirjautunut järjestelmään
Käyttötiheys: 75 kertaa päivässä

1. KT tuo kirjautumissivun ruudulle
2. Käyttäjä kirjaa käyttäjätunnuksensa ja salasanansa
	P1 Virheilmoitus “Salasana tai käyttäjätunnus on väärä”
	V2 Käyttäjä keskeyttää KT:en
3. KT tuo profiilisivun näkyviin
4. KT loppuu


# 4.Rautalankamallit

## 4.1 Profiilin luonti

**Profiilin luonti selaimella**

![Profiilin luonti selaimella](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profluonti.png)

**Profiilin luonti mobiililaitteella**

![Profiilin luonti mobiililla](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profluonti2.png)

## 4.2 Profiilin näyttö

**Profiilin näyttö selaimella**

![Profiilin näyttö -selaimella](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profiilinnayttosivu.png)

**Profiilin näyttäminen mobiililaitteella**

![Profiilin näyttö -mobiilina](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profiilinnayttosivu2.png)

# 5.Projektin kehitys
Ensimmäinen idea projektiksi oli palvelu, jossa on näkyvissä deadlinet, kokeet ja muut tapahtumat. Tarkoitus oli esittää ne lukujärjestysmäisesti. Ideana oli myös lisätä stressi-nappula, jonka avulla käyttäjät olisivat pystyneet äänestämään stressaavimmat deadlinet. Ideaa kehittäessä tajusimme lukujärjestysnäkymän olevan epäkäytännöllinen tapa näyttää deadlinet esim pieneltä näytöltä. Päädyimme muuttamaan ideaa niin, että deadlinet näkyisivät listana ja 7 seuraavaa deadlinea olisi ensimmäisenä. Listaa pystyisi kuitenkin itse muokkaamaan ja deadlineja poistamaan.

Kokeilimme ideaa google sheetillä, mutta idea jäi siihen, ettei palvelu toisi mitään lisäarvoa. Aikataulut pitäisi kuitenkin itse lisätä ja ne voi silloin lisätä muuhun kalenteriin.

![Excel prototyyppi](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/prototyyppi2.PNG)

Seuraavassa ideassamme keskityimme yhteisöllisyyteen ja kontaktoitumiseen. Tarkoitus oli luoda foorumi missä profiilin tiedoissa näkee ihmisen kiinnostukset ja sitä kautta ihmiset voisivat löytää kiinnostavia tuttavia. Lisäksi foorumissa voisi käydä avointa keskustelua ja pyytää apua koulutehtäviin. Tarkoitus oli alentaa kynnystä pyytää apua. Avun tarjoamisesta ja neuvomisesta olisi voinut mahdollisesti saada opintopisteitä.

Kokeilimme ideaa ilmaisfoorumilla ja se toimi siellä ihan hyvin. Oman foorumin tekeminen ei olisi tuonut juurikaan lisäarvoa.

Emme luopuneet kuitenkaan ideasta, vaan foorumin pohjalta ideoimme Twimm-palvelun. Twimm muistuttaa vähän tinderiä ja siinä listataan kiinnostuksen kohteet, jonka pohjalta käyttäjälle ehdotetaan muita käyttäjiä joilla on samoja kiinnostuksen kohteita. Ensin käyttäjä käy läpi kiinnostuksen kohteensa ja palvelu kertoo onko muita samanhenkisiä käyttäjiä. Sitten käyttäjä voi halutessaan luoda profiilin palveluun ja nähdä muiden samanhenkisten käyttäjien profiileja. Jos käyttäjä haluaa olla yhteydessä muihin käyttäjiin hän lähettää kiinnostus-pyynnön, jonka pyynnön saanut voi hyväksyä tai hylätä pyynnön. 

# twimm
# 1. Case 
Taiga-Urho opiskelija tahtoo l�yt�� koulusta samoista asioista kiinnostuneita ihmisi�, joista saada kavereita ja joiden kanssa voisi tehd� kouluteht�vi� ja projekteja. Taiga-Urho on hieman ujo eik� uskalla l�hesty� vieraita ihmisi� ja ei my�sk��n tied� ket� kannattaisi l�hesty�. Taiga-Urhon mielest� on helpompi tutustua ihmisiin netiss�, mutta sellaista palvelua ei ole, josta l�yt�� koulun sis�lt� samoista asioista kiinnostuneita henkil�it�. Taiga-Urho haluaa palvelun, joka k�ytt�minen on helppoa ja nopeaa. 

# 2. Use Case

Use Case Diagram

![Use Case Diagram](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/UseCaseDiagram.PNG)


# 3. K�ytt�tapaukset

K�ytt�tapaus: Kiinnostusten listaus
Toimijat: K�ytt�j�
Esiehto:-
Lopputulos:K�ytt�j�n kiinnostuksen kohteet on listattu ja n�kyv�t k�ytt�j�lle
K�ytt�tiheys: 50 kertaa p�iv�ss�

1. KT tuo yksitellen kiinnostuksen kohteet ruudulle
2. K�ytt�j� valitsee kiinnostaako h�nt� listan kohteet, kyll� - ei. 
	V2 K�ytt�j� keskeytt�� kiinnostustensa listauksen
3. KT n�ytt�� k�ytt�j�n kiinnostuksen kohteet 
4. KT loppuu


K�ytt�tapaus: Profiilin luonti
Toimijat: K�ytt�j� 
Esiehto: K�ytt�tapausta on kutsuttu toisesta k�ytt�tapauksesta, kiinnostusten listaus tehtyn�
Lopputulos: Profiilin luonti palveluun valmis
K�ytt�tiheys: 47 kertaa p�iv�ss�

1. KT tuo profiilin luonti-lomakkeen ruudulle
2. K�ytt�j� t�ytt�� tiedot ja l�hett�� lomakkeen
	P1 Virheilmoitus �S�hk�postiosoitteen pit�� olla oikeassa muodossa�
	P2 Virheilmoitus �Lomakkeessa ei saa olla tyhji� kentti�
 	V2 K�ytt�j� keskeytt�� lomakkeen t�ytt�misen
3. KT loppuu


K�ytt�tapaus: Muiden k�ytt�jien profiilien selaus
Toimijat: K�ytt�j�
Esiehto: Profiilin luonti pit�� olla tehtyn� ja profiilin tiedot l�ytyv�t kannasta
Lopputulos: Kiinnostavien profiilien l�yt�minen
K�ytt�tiheys: 70 kertaa p�iv�ss�

1. KT tuo k�ytt�j�n profiilisivun n�kyviin ruudulle ja n�ytt�� k�ytt�j�n kiinnostuksia vastaavat profiilit
2. K�ytt�j� selaa profiileja kunnes l�yt�� kiinnostavia k�ytt�ji�
	V2 k�ytt�j� keskeytt�� profiilien selauksen
3. KT loppuu

K�ytt�tapaus: J�rjestelm��n kirjautuminen
Toimijat: K�ytt�j�
Esiehto: Profiilin luonti KT pit�� olla tehtyn� ja profiilin l�ydytt�v� kannasta
Lopputulos: K�ytt�j� on onnistuneesti kirjautunut j�rjestelm��n
K�ytt�tiheys: 75 kertaa p�iv�ss�

1. KT tuo kirjautumissivun ruudulle
2. K�ytt�j� kirjaa k�ytt�j�tunnuksensa ja salasanansa
	P1 Virheilmoitus �Salasana tai k�ytt�j�tunnus on v��r�
	V2 K�ytt�j� keskeytt�� KT:en
3. KT tuo profiilisivun n�kyviin
4. KT loppuu


# 4.Rautalankamallit

## 4.1 Profiilin luonti

**Profiilin luonti selaimella**

![Profiilin luonti selaimella](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profluonti.png)

**Profiilin luonti mobiililaitteella**

![Profiilin luonti mobiililla](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profluonti2.png)

## 4.2 Profiilin n�ytt�

**Profiilin n�ytt� selaimella**

![Profiilin n�ytt� -selaimella](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profiilinnayttosivu.png)

**Profiilin n�ytt�minen mobiililaitteella**

![Profiilin n�ytt� -mobiilina](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/profiilinnayttosivu2.png)

# 5.Projektin kehitys
Ensimm�inen idea projektiksi oli palvelu, jossa on n�kyviss� deadlinet, kokeet ja muut tapahtumat. Tarkoitus oli esitt�� ne lukuj�rjestysm�isesti. Ideana oli my�s lis�t� stressi-nappula, jonka avulla k�ytt�j�t olisivat pystyneet ��nest�m��n stressaavimmat deadlinet. Ideaa kehitt�ess� tajusimme lukuj�rjestysn�kym�n olevan ep�k�yt�nn�llinen tapa n�ytt�� deadlinet esim pienelt� n�yt�lt�. P��dyimme muuttamaan ideaa niin, ett� deadlinet n�kyisiv�t listana ja 7 seuraavaa deadlinea olisi ensimm�isen�. Listaa pystyisi kuitenkin itse muokkaamaan ja deadlineja poistamaan.

Kokeilimme ideaa google sheetill�, mutta idea j�i siihen, ettei palvelu toisi mit��n lis�arvoa. Aikataulut pit�isi kuitenkin itse lis�t� ja ne voi silloin lis�t� muuhun kalenteriin.

![Excel prototyyppi](https://raw.githubusercontent.com/Kastanat/twimm/master/src/main/webapp/resources/images/prototyyppi2.PNG)

Seuraavassa ideassamme keskityimme yhteis�llisyyteen ja kontaktoitumiseen. Tarkoitus oli luoda foorumi miss� profiilin tiedoissa n�kee ihmisen kiinnostukset ja sit� kautta ihmiset voisivat l�yt�� kiinnostavia tuttavia. Lis�ksi foorumissa voisi k�yd� avointa keskustelua ja pyyt�� apua kouluteht�viin. Tarkoitus oli alentaa kynnyst� pyyt�� apua. Avun tarjoamisesta ja neuvomisesta olisi voinut mahdollisesti saada opintopisteit�.

Kokeilimme ideaa ilmaisfoorumilla ja se toimi siell� ihan hyvin. Oman foorumin tekeminen ei olisi tuonut juurikaan lis�arvoa.

Emme luopuneet kuitenkaan ideasta, vaan foorumin pohjalta ideoimme Twimm-palvelun. Twimm muistuttaa v�h�n tinderi� ja siin� listataan kiinnostuksen kohteet, jonka pohjalta k�ytt�j�lle ehdotetaan muita k�ytt�ji� joilla on samoja kiinnostuksen kohteita. Ensin k�ytt�j� k�y l�pi kiinnostuksen kohteensa ja palvelu kertoo onko muita samanhenkisi� k�ytt�ji�. Sitten k�ytt�j� voi halutessaan luoda profiilin palveluun ja n�hd� muiden samanhenkisten k�ytt�jien profiileja. Jos k�ytt�j� haluaa olla yhteydess� muihin k�ytt�jiin h�n l�hett�� kiinnostus-pyynn�n, jonka pyynn�n saanut voi hyv�ksy� tai hyl�t� pyynn�n. 

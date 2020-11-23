# CustomCardMultiPreview

Clone this repository and simple adds CustomCardMultiPreview to your cards folder in your mod.

In order to create a multi-preview card, simply extends from this class
Then, in your constructor, adds the cards to this.cardToPreview
Exemple:
this.cardToPreview.add(new Wound());
this.cardToPreview.add(new Dazed());

Known issues:

- Cards generate in front of the selection arrows in the compendium
- If there is more than 3 cards, they will go offscreen
- Using the Upgraded option in the compedium will not update cards in the small Preview

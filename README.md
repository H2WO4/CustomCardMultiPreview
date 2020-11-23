# CustomCardMultiPreview

<p>Clone this repository and simple adds CustomCardMultiPreview to your cards folder in your mod.</p>

<br>

<p>In order to create a multi-preview card, simply extends from this class.<br>
Then, in your constructor, adds the cards to this.cardToPreview.</p>

<p>Exemple:</p>

> <p>this.cardToPreview.add(new Wound());<br>
> this.cardToPreview.add(new Dazed());
</p>

<br>

<p>Known issues:

- Cards generate in front of the selection arrows in the compendium
- If there is more than 3 cards, they will go offscreen
- Using the Upgraded option in the compedium will not update cards in the small Preview

</p>

# CustomCardMultiPreview

<p>Clone this repository and simple adds CustomCardMultiPreview to your cards folder in your mod.</p>

<br>

<p>In order to create a multi-preview card, simply extends from this class.<br>
Then, in your constructor, adds the cards to `this.cardToPreview`.</p>

<p>Example:</p>

> `this.cardToPreview.add(new Wound());`<br>
> `this.cardToPreview.add(new Dazed());`<br><br>
There also is an example card `Ravage.class` in this repository.


<br>

<p>Known issues:

- More than 5 cards are not supported.
- Support for more is not considered.
- Using the Upgraded option in the Compedium will not update cards in the small preview.

</p>
<br>
<p>If you want to contribute to this, feel free to fork and send a PR</p>

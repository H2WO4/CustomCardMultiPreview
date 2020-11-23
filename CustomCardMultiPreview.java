// package yourModID.cards;
import basemod.abstracts.CustomCard;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

import java.util.ArrayList;

public abstract class CustomCardMultiPreview extends CustomCard {

    public ArrayList<AbstractCard> cardToPreview = new ArrayList<AbstractCard>();
    private boolean renderTip;

    public CustomCardMultiPreview(final String id,
                                  final String name,
                                  final String img,
                                  final int cost,
                                  final String rawDescription,
                                  final CardType type,
                                  final CardColor color,
                                  final CardRarity rarity,
                                  final CardTarget target){

        super(id, name, img, cost, rawDescription, type, color, rarity, target);
        this.cardsToPreview = this;
    }

    @Override
    public void renderCardPreviewInSingleView(SpriteBatch sb) {
        float size = 1.1F - (0.1F * cardToPreview.size());
        for (int i = 0; i < cardToPreview.size(); i++) {
            this.cardToPreview.get(i).current_x = 485.0F * Settings.scale;
            this.cardToPreview.get(i).current_y = 795.0F - (360.0F * i * size) * Settings.scale;
            this.cardToPreview.get(i).drawScale = 0.8F * size;
            this.cardToPreview.get(i).render(sb);
        }
    }

    @Override
    public void renderCardPreview(SpriteBatch sb) {
        float size = 1.1F - (0.1F * cardToPreview.size());
        for (int i = 0; i < cardToPreview.size(); i++) {
            if (AbstractDungeon.player == null || !AbstractDungeon.player.isDraggingCard) {
                float tmpScale = this.drawScale * size * 0.8F;
                if (this.current_x > (float)Settings.WIDTH * 0.75F) {
                    this.cardToPreview.get(i).current_x = this.current_x + (IMG_WIDTH / 2.0F + IMG_WIDTH / 2.0F * 0.8F + 16.0F) * this.drawScale;
                } else {
                    this.cardToPreview.get(i).current_x = this.current_x - (IMG_WIDTH / 2.0F + IMG_WIDTH / 2.0F * 0.8F + 16.0F) * this.drawScale;
                }
                this.cardToPreview.get(i).current_y = this.current_y + (IMG_HEIGHT / 2.0F - IMG_HEIGHT / 2.0F * 0.8F) + (360.0F * i * size) * this.drawScale;
                this.cardToPreview.get(i).drawScale = tmpScale * size;
                this.cardToPreview.get(i).render(sb);
            }
        }
    }
}

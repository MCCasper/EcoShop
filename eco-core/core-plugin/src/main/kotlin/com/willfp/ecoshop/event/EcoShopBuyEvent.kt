package com.willfp.ecoshop.event

import com.willfp.eco.core.price.Price
import com.willfp.ecoshop.shop.BuyType
import com.willfp.ecoshop.shop.Shop
import com.willfp.ecoshop.shop.ShopItem
import org.bukkit.entity.Player
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent

class EcoShopBuyEvent(
    who: Player,
    val shopItem: ShopItem,
    var price: Price,
    var buyType: BuyType,
    var amount: Int,
    var shop: Shop?
) : PlayerEvent(who) {

    // Below here is bukkit boilerplate
    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        @JvmStatic
        private val HANDLERS: HandlerList = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return HANDLERS
        }
    }
}

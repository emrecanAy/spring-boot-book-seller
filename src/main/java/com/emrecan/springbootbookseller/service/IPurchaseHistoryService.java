package com.emrecan.springbootbookseller.service;

import com.emrecan.springbootbookseller.model.PurchaseHistory;
import com.emrecan.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author Emrecan
 * @created 01/11/2021 - 00:38
 */
public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}

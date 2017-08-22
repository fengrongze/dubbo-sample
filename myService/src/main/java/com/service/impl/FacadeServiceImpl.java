package com.service.impl;

import com.service.FacadeService;
import com.service.entity.WalletEntity;
import sun.font.FontRunIterator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengrongze on 2017/8/22.
 */
public class FacadeServiceImpl implements FacadeService {

    private Map<Integer,WalletEntity> wallets = new HashMap<Integer, WalletEntity>();

    {
        for (int i = 0; i <10 ; i++) {
            WalletEntity wallet = new WalletEntity();
            wallet.setId(i);
            wallet.setName("测试："+i);
            wallet.setTotal(i+100);
            wallets.put(i,wallet);
        }
    }



    public WalletEntity queryWallet(int id) {
        return wallets.get(id);
    }
}

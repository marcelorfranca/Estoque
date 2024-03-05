package com.ellca.estoque.dao;

import org.springframework.stereotype.Repository;

import com.ellca.estoque.dominio.Item;

@Repository
public class ItemDaoImpl extends AbstractDao<Item, Long> implements ItemDao {

}

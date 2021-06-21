package com.bhatti.msscbeerservices.web.mappers;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-19T16:29:03+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class BeerMapperImpl extends BeerMapperDecorator implements BeerMapper {

    private final BeerMapper delegate;

    public BeerMapperImpl() {
        this( new BeerMapperImpl_() );
    }

    private BeerMapperImpl(BeerMapperImpl_ delegate) {
        this.delegate = delegate;
    }
}

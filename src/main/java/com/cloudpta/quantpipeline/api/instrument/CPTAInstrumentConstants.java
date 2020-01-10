/*

Copyright 2017-2019 Advanced Products Limited, 
dannyb@cloudpta.com
github.com/dannyb2018

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package com.cloudpta.quantpipeline.api.instrument;

/**
 *
 * @author Danny
 */
public interface CPTAInstrumentConstants
{
    /*
1 - CUSIP
2 - SEDOL
3 - QUIK
4 - ISIN
5 - RIC
6 - ISO Curr
7 - ISO Country
8 - Exch Symb
9 - CTA
A - Blmbrg
B - Wertpapier
C - Dutch
D - Valoren
E - Sicovam
F - Belgian
G - Common
H - Clearing House
I - ISDA/FpML    
    */
    public final static String ID_SOURCE_INTERNAL = "CPTA";
    public final static String ID_SOURCE_RIC = "RIC";
    public final static String ID_SOURCE_SEDOL = "SEDOL";
    public final static String ID_SOURCE_ISIN = "ISIN";
    public final static String ID_SOURCE_TICKER = "SYMBOL";
    public final static String ID_SOURCE_BLOOMBERG = "BBG";
    public final static String ID_SOURCE_CUSIP = "CUSIP";
    public final static String ID_SOURCE_NAME = "NAME";
    public final static String ID_SOURCE_QUIK = "QUIK";

    public static final String ID_FIELD_NAME = "Identifier";
    public static final String ID_SOURCE_FIELD_NAME = "IdentifierType";
    
}

/*
**********************************************************************
*   Copyright (c) 2001, International Business Machines
*   Corporation and others.  All Rights Reserved.
**********************************************************************
*   Date        Name        Description
*   04/02/2001  aliu        Creation.
**********************************************************************
*/
#include "remtrans.h"

static const UChar ID[] = {65, 110, 121, 45, 0x52, 0x65, 0x6D, 0x6F, 0x76, 0x65, 0x00}; /* "Any-Remove" */

U_NAMESPACE_BEGIN

/**
 * System registration hook.
 */
void RemoveTransliterator::registerIDs() {

    Transliterator::_registerFactory(::ID, _create, integerToken(0));

    Transliterator::_registerSpecialInverse(UnicodeString("Remove", ""),
                                            UnicodeString("Null", ""), FALSE);
}

/**
 * Factory method
 */
Transliterator* RemoveTransliterator::_create(const UnicodeString& ID,
                                              Token /*context*/) {
    return new RemoveTransliterator();
}

RemoveTransliterator::RemoveTransliterator() : Transliterator(::ID, 0) {}

RemoveTransliterator::~RemoveTransliterator() {}

Transliterator* RemoveTransliterator::clone(void) const {
    return new RemoveTransliterator();
}

void RemoveTransliterator::handleTransliterate(Replaceable& text, UTransPosition& index,
                                               UBool /*isIncremental*/) const {
    // Our caller (filteredTransliterate) has already narrowed us
    // to an unfiltered run.  Delete it.
    UnicodeString empty;
    text.handleReplaceBetween(index.start, index.limit, empty);
    int32_t len = index.limit - index.start;
    index.contextLimit -= len;
    index.limit -= len;
}
U_NAMESPACE_END


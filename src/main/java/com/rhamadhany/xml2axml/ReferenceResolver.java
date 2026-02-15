package com.rhamadhany.xml2axml;

import com.rhamadhany.xml2axml.chunks.AttrChunk;
import com.rhamadhany.xml2axml.chunks.ValueChunk;

/**
 * Created by Roy on 15-10-5.
 */
public interface ReferenceResolver {
    int resolve(ValueChunk value, String ref);
}

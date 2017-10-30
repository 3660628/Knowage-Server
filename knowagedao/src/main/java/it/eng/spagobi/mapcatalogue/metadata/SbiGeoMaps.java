/*
 * Knowage, Open Source Business Intelligence suite
 * Copyright (C) 2016 Engineering Ingegneria Informatica S.p.A.
 *
 * Knowage is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Knowage is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.eng.spagobi.mapcatalogue.metadata;

import it.eng.spagobi.commons.metadata.SbiBinContents;
import it.eng.spagobi.commons.metadata.SbiHibernateModel;
import it.eng.spagobi.mapcatalogue.bo.GeoMap;

// Generated 31-mag-2007 14.53.27 by Hibernate Tools 3.2.0.beta8

/**
 * SbiGeoMaps generated by hbm2java
 */
public class SbiGeoMaps extends SbiHibernateModel {

	// Fields

	private int mapId;

	private String name;

	private String descr;

	private String url;

	private String format;

	private String hierarchyName;

	private Integer level;

	private String memberName;

	private SbiBinContents binContents = null;

	// Constructors

	/**
	 * default constructor.
	 */
	public SbiGeoMaps() {
	}

	/**
	 * minimal constructor.
	 *
	 * @param mapId
	 *            the map id
	 */
	public SbiGeoMaps(int mapId) {
		this.mapId = mapId;
	}

	/**
	 * full constructor.
	 *
	 * @param mapId
	 *            the map id
	 * @param name
	 *            the name
	 * @param descr
	 *            the descr
	 * @param url
	 *            the url
	 * @param format
	 *            the format
	 * @param binContents
	 *            the binary contents of svg file
	 */
	public SbiGeoMaps(int mapId, String name, String descr, String url, String format, String hierarchyName, Integer level, String memberName,
			SbiBinContents binContents) {
		this.mapId = mapId;
		this.name = name;
		this.descr = descr;
		this.url = url;
		this.format = format;
		this.hierarchyName = hierarchyName;
		this.level = level;
		this.memberName = memberName;
		this.binContents = binContents;
	}

	// Property accessors
	/**
	 * Gets the map id.
	 *
	 * @return the map id
	 */
	public int getMapId() {
		return this.mapId;
	}

	/**
	 * Sets the map id.
	 *
	 * @param mapId
	 *            the new map id
	 */
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the descr.
	 *
	 * @return the descr
	 */
	public String getDescr() {
		return this.descr;
	}

	/**
	 * Sets the descr.
	 *
	 * @param descr
	 *            the new descr
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * Sets the url.
	 *
	 * @param url
	 *            the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the format.
	 *
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the format.
	 *
	 * @param format
	 *            the new format
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the hierarchyName
	 */
	public String getHierarchyName() {
		return hierarchyName;
	}

	/**
	 * @param hierarchyName
	 *            the hierarchyName to set
	 */
	public void setHierarchyName(String hierarchyName) {
		this.hierarchyName = hierarchyName;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName
	 *            the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the binContents
	 */
	public SbiBinContents getBinContents() {
		return binContents;
	}

	/**
	 * @param binContents
	 *            the binContents to set
	 */
	public void setBinContents(SbiBinContents binContents) {
		this.binContents = binContents;
	}

	/**
	 * From the Hibernate Map object at input, gives the corrispondent <code>GeoMap</code> object.
	 *
	 * @param hibMap
	 *            The Hibernate Map object
	 *
	 * @return the corrispondent output <code>GeoMap</code>
	 */
	public GeoMap toGeoMap() {

		GeoMap map = new GeoMap();
		map.setMapId(getMapId());
		map.setName(getName());
		map.setDescr(getDescr());
		map.setFormat(getFormat());
		map.setHierarchyName(getHierarchyName());
		map.setLevel(getLevel());
		map.setMemberName(getMemberName());
		map.setUrl(getUrl());
		SbiBinContents tmpBin = getBinContents();
		if (tmpBin != null) {
			map.setBinId(tmpBin.getId().intValue());
		}

		return map;
	}

}
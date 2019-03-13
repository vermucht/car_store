let defaultCarImage = 'components/car/car-default-image.png';

/**
 * Formatter for car items.
 */
class CarFormat {

    static cardHtml(car) {
        let res = '';
        res += `<div class="car-image-div"><img class="car-image-img" src="${defaultCarImage}" alt="${car.mark.manufacturer} ${car.mark.model}"></div>`;
        res += `<div>${this.descriptionHtml(car)}</div>`;
        return res;
    }

    /**
     * Returns Car item as html card.
     * @param {Car} car
     */
    static descriptionHtml(car) {
        let res = '';
        res += `<p class="car-title">${car.mark.manufacturer} ${car.mark.model}</>`;
        res += `<p class="car-price">${car.price.toLocaleString()} ₽</p>`;
        res += `<p class="car-description"><b>Body: </b>${Object.values(car.body).join('; ')}</p>`;
        res += `<p class="car-description"><b>Age: </b>${[
            car.age.manufactureYear,
            car.age.newness,
            car.age.mileage.toLocaleString() + 'km'
        ].join('; ')}`;
        res += '<p class="car-description"><b>Engine: </b>' + Object.values(car.engine).join('; ') + '</p>';
        res += '<p class="car-description"><b>Chassis: </b>' + Object.values(car.chassis).join('; ') + '</p>';
        return res;
    }
}

/**
 * Car - main item to sale.
 */
class Car {
    /** Price */
    price;
    /** Mark info */
    mark;
    /** Body info */
    body;
    /** Age info */
    age;
    /** Engine info */
    engine;
    /** Chassis info */
    chassis;

    /**
     * Constructs new car object.
     *
     * @param {number} price
     * @param {Mark} mark
     * @param {Body} body
     * @param {Age} age
     * @param {Engine} engine
     * @param {Chassis} chassis
     */
    constructor(price, mark, body, age, engine, chassis) {
        this.price = price;
        this.mark = mark;
        this.body = body;
        this.age = age;
        this.engine = engine;
        this.chassis = chassis;
    }
}

/**
 * Mark info class.
 */
class Mark {
    /** Manufacturer (Ford, Mercedes) */
    manufacturer;
    /** Model (FX-1800, AMG-380) */
    model;

    /**
     * Constructs object.
     *
     * @param {string} manufacturer
     * @param {string} model
     */
    constructor(manufacturer, model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}

/**
 * Car body info.
 */
class Body {
    /** Body type (sedan, track, SUV) */
    type;
    /** Body color (black, white, red) */
    color;

    /**
     * Constructs object.
     * @param {string} type
     * @param {string} color
     */
    constructor(type, color) {
        this.type = type;
        this.color = color;
    }
}

/**
 * Age info object.
 */
class Age {
    /** Year of manufacturing (2003). */
    manufactureYear;
    /** Car newness (new, used). */
    newness;
    /** Car mileage, kilometers (150 000) */
    mileage;

    /**
     * Constructs new Age object.
     *
     * @param {number} manufactureYear
     * @param {string} newness
     * @param {number} mileage
     */
    constructor(manufactureYear, newness, mileage) {
        this.manufactureYear = manufactureYear;
        this.newness = newness;
        this.mileage = mileage;

    }
}

/**
 * Engine info class.
 */
class Engine {
    /** Engine type (gasoline, kerosene, gas) */
    engineType;
    /** Engine volume, liters (1.2) */
    engineVolume;

    /**
     * Constructs new object.
     *
     * @param {string} engineType
     * @param {number} engineVolume
     */
    constructor(engineType, engineVolume) {
        this.engineType = engineType;
        this.engineVolume = engineVolume;
    }
}

/**
 * Chassis info object.
 */
class Chassis {
    /** Transmission type (automatic, manual) */
    transmissionType;

    /**
     * Constructs new object.
     * @param {string} transmissionType
     */
    constructor(transmissionType) {
        this.transmissionType = transmissionType;
    }
}
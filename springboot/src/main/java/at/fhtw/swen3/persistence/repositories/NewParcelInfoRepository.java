package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.persistence.entities.NewParcelInfoEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class NewParcelInfoRepository implements JpaRepository<NewParcelInfoEntity, Long> {
    @Override
    public List<NewParcelInfoEntity> findAll() {
        return null;
    }

    @Override
    public List<NewParcelInfoEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<NewParcelInfoEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<NewParcelInfoEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(NewParcelInfoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends NewParcelInfoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends NewParcelInfoEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<NewParcelInfoEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends NewParcelInfoEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<NewParcelInfoEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public NewParcelInfoEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public NewParcelInfoEntity getById(Long aLong) {
        return null;
    }

    @Override
    public NewParcelInfoEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends NewParcelInfoEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends NewParcelInfoEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends NewParcelInfoEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends NewParcelInfoEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
